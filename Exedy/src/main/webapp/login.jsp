<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
  <!-- Add Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <!-- Add custom styles -->
  <style>
    body {
      background-color: #f8f9fa;
    }
    .login-container {
      max-width: 400px;
      margin: 0 auto;
      margin-top: 150px;
      padding: 20px;
      background-color: #ffffff;
      border: 1px solid #dee2e6;
      border-radius: 5px;
    }
  </style>
</head>
<body>
  <div class="container">
    <div class="login-container">
      <h2>Login</h2>
      <form action="LoginServlet1" method="post">
        <div class="form-group">
          <label for="username">Username:</label>
          <input type="text" class="form-control" id="username" name="username" required>
        </div>
        <div class="form-group">
          <label for="password">Password:</label>
          <input type="password" class="form-control" id="password" name="password" required>
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
      </form>
    </div>
  </div>
</body>
</html>
