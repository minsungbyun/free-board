<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Ajax로 JSON 받아오기</title>
  <style type="text/css">

    div.container {
      margin-bottom: 20px;
    }

    button:hover {
      cursor: pointer;
      color: salmon;
      text-decoration: underline;
    }

    table {
      border: 2px solid #000000;
    }

  </style>
</head>
<body>

  <div class="container">
    <button>버튼</button>
  </div>

  <table>
    <thead>
      <tr>
         <th><i>app_name</i></th>
         <th><i>user_name</i></th>
         <th><i>version</i></th>
         <th><i>email</i></th>
         <th><i>domain</i></th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
    </tbody>
  </table>
  

  <script type="text/javascript">

    document.querySelector('button').addEventListener('click', () => {
      const xhr = new XMLHttpRequest();
      xhr.addEventListener('readystatechange',() => {
        if (xhr.readyState == xhr.DONE) {
          if (xhr.status == 200 || xhr.status == 201) {
            console.log(xhr.response);
          }
        } 
      });
      xhr.open('GET', "../resources/json/sample.json", true);
      xhr.send();
    });

  </script>
</body>
</html>