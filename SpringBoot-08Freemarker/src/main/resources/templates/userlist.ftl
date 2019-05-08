<html>

	<head>
		<title>显示用户信息</title>
		<meta charset="utf-8" />
	</head>

	<body>

		<table border="1" align="center" width="50%">
			<tr>
				<th>姓名</th>
				<th>年龄</th>
				<th>地址</th>
			</tr>

			<#list userlist as user>

				<tr>
					<th>${user.username}</th>
					<th>${user.age}</th>
					<th>${user.address}</th>
				</tr>

			</#list>

		</table>

	</body>

</html>