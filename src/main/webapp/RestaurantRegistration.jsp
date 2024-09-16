<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            width: 50%;
            margin: auto;
            padding: 30px;
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-top: 50px;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        .form-grid {
            display: grid;
            grid-template-columns: 1fr 1fr;
            gap: 20px;
        }
        .form-grid label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }
        .form-grid input[type="text"],
        .form-grid input[type="tel"],
        .form-grid input[type="email"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        @media (max-width: 600px) {
            .form-grid {
                grid-template-columns: 1fr;
            }
        }
    </style>

</head>
<body>
<div class="container">
        <h1>Enter Details</h1>
        <form action="ResRegestration" method="post">
            <div class="form-grid">
                <div>
                    <label for="resId" >ResId</label>
                    <input type="text" id="resId" name="resId" required>
                </div>
                
                
                <div>
                    <label for="resName">ResName</label>
                    <input type="text" id="resName" name="resName" required>
                </div>
                <div>
                    <label for="address" >Address</label>
                    <input type="text" id="address" name="address" required>
                </div>
                <div>
                    <label for="location">Location</label>
                    <input type="text" id="location" name="location" required>
                </div>
                <div>
                    <label for="openTime">OpenTime</label>
                    <input type="text" id="openTime" name="openTime" required>
                </div>
                <div>
                    <label for="closeTime">CloseTime</label>
                    <input type="text" id="closeTime" name="closeTime" required>
                </div>
                <div>
                    <label for="gstNumber">GstNumber</label>
                    <input type="text" id="gstNumber" name="gstNumber" required>
                </div>
                <div>
                    <label for="contactNumber">contactNumber</label>
                    <input type="text" id="contactNumber" name="contactNumber" required>
                </div>
                <div>
                    <label for="email">Email</label>
                    <input type="text" id="email" name="email" required>
                </div>
                 <div>
                    <label for="avgRating">AvgRating</label>
                    <input type="text" id="avgRating" name="avgRating" required>
                </div>
                 <div>
                    <label for="password">Password</label>
                    <input type="text" id="password" name="password" required>
                </div> 
            </div>
            <input type="submit" value="Submit">
       
    </div>


</body>
</html>