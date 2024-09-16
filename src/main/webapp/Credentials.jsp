<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(135deg, #6e8efb, #a777e3);
            font-family: 'Arial', sans-serif;
            margin: 0;
        }
        .container {
            background: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
            text-align: center;
        }
        h2 {
            margin-bottom: 20px;
            color: #333;
        }
        .input-group {
            margin-bottom: 15px;
            text-align: left;
        }
        label {
            display: block;
            margin-bottom: 5px;
            color: #666;
        }
        input {
            width: calc(100% - 20px);
            padding: 10px;
            margin: 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        input:focus {
            border-color: #6e8efb;
            outline: none;
        }
        button {
            width: 100%;
            padding: 10px;
            border: none;
            border-radius: 5px;
            background: #6e8efb;
            color: #fff;
            font-size: 16px;
            cursor: pointer;
            transition: background 0.3s;
        }
        button:hover {
            background: #a777e3;
        }
    </style>
</head>
<body>
    <div class="container"> 
        <h2>Login</h2>
        <form action="CredentialsValidation" method="get">
        <div class="input-group">
            <label for="id">Id</label>
            <input type="text" id="id" name="id" required>
        </div>
        <div class="input-group">
            <label for="password">Password</label>
            <input type="text" id="password" name="password" required>
        </div>
        <button type="submit">Login</button>

</body>
</html>