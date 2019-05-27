<!DOCTYPE>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" >
    <title>MagazinOnline - Register Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>


        <h1 style="font-size:100px">Register</h1>w

<form method="post" action="register">
    <div class="container">
        <div class="c1">
            <label for="Nume">Last name: </label>
            <input  type="text" placeholder="Introdu nume" name="Nume" id = "Nume" required >
        </div>

        <div class="c2">
            <label for="Prenume">First name: </label>
            <input  type="text" placeholder="Enter Prenume" name="Prenume" id = "Prenume" required >
        </div>

        <div class="c3">
            <label for="email">Phone number: </label>
            <input  type="text" placeholder="Enter email" name="email" id = "email">
        </div>

        <div class="c4">
            <label for="username">Username: </label>
            <input  type="text" placeholder="Enter Username" name="username" id = "username" required >
        </div>

        <div class="c5">
            <label for="parola">Password: </label>
            <input type="password" placeholder="Enter Parola" name="parola" id = "parola" required>
        </div>

        <div>
            <button class = "btn" type="submit" name="action">Register</button>
        </div>

    </div>
</form>

<div id="result" class="result">
    <pre>
        ${requestScope.registerStatus}
    </pre>
</div>

</body>
</html>