<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
  }
  .container {
    max-width: 400px;
    margin: 50px auto;
    background: #fff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0,0,0,0.1);
  }
  .form-group {
    margin-bottom: 20px;
  }
  .form-group label {
    display: block;
    font-weight: bold;
    margin-bottom: 5px;
  }
  .form-group input[type="text"],
  .form-group textarea {
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    font-size: 16px;
  }
  .form-group textarea {
    height: 100px;
  }
  .btn {
    display: block;
    width: 100%;
    padding: 10px;
    background-color: #4caf50;
    color: #fff;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
  }
  .btn:hover {
    background-color: #45a049;
  }
</style>
</head>
<body>

<div class="container">
  <h2>Product Information</h2>
  <form action="formAdd" method="post" >
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" name="name" required>
    </div>
    <div class="form-group">
      <label for="details">Details:</label>
      <textarea name="desc" required></textarea>
    </div>
    <div class="form-group">
      <label for="price">Price:</label>
      <input type="text" name="price" required>
    </div>
    <button type="submit" class="btn">Submit</button>
  </form>
</div>

</body>
</html>