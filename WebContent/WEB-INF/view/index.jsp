<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="js/jquery-1.7.2.min.js"></script>
</head>
<body>
<p>hhhh</p>

<input id="test" type="button" value="click"/>
<input id="channelApi" type="text" value="chaoge"/>
<script>
	/* $(function(){
		$.ajax({
		      url: 'greeting',
		      dataType: 'json',
		      success: function(data) {
		       console.log(data.employees[0].firstName);
		      },
		      statusCode: {
		        404: function() {
		          console.log("no data")
		        }
		      }
		    });
	}) */
	
	var channelApi;
	// 刷新汇率
    $('#test').click(function(){
    	channelApi = $("#channelApi").val();
    	console.log(channelApi);
       $.ajax({
		  url:'boss/easysettlement/refreshRate',
		  data:{
			  'channelApi' : channelApi
		  },
		  dataType:'json',
		  type:'post',
		  success:function(res){
		  	var display = res.msg;
		  	console.log(res)
		  	if(res.code == '0'){
				$('#usdRate').html(res.rateResult.usdInfo.rate);
				$('#eurRate').html(res.rateResult.eurRateInfo.rate);
				$('#jpyRate').html(res.rateResult.jpyRateInfo.rate);
				$('#hkdRate').html(res.rateResult.hkdRateInfo.rate);
				$('#gbpRate').html(res.rateResult.gbpRateInfo.rate);
		  		Y.alert('提示',"刷新成功！");
			} else {
				Y.alert('提示',"刷新失败！");
			}
		  }
	  });
	  
	});
</script>

</body>
</html>