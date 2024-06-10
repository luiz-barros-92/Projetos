<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <title>Exercise Weapon Calculator</title>
</head>
<body>
    <h1>Calcule o tempo da sua exercise weapon</h1>
    <label for="n">Quantas cargas na exercise weapon?: </label>
    <input type="number" id="n" name="n" onkeydown="if(event.keyCode==13) calculateTime()" autofocus><br><br>
    <button onclick="calculateTime()">Calcular</button>
    <button onclick="location.reload()">Limpar</button>
    <pre id="output"></pre>

    <script>
        function calculateTime() {
            const n = parseInt(document.getElementById('n').value);
            if (isNaN(n) || n < 0) {
                document.getElementById('output').textContent = 'Por favor, insira um número válido de cargas.';
                return;
            }

            const segundos = n * 2;
            const mintot = segundos / 60;
            const horas = Math.floor(mintot / 60);
            const minutos = Math.floor(mintot % 60);

            document.getElementById('output').textContent = `Sua exercise weapon tem ${horas} horas e ${minutos} minutos.`;
        }
    </script>
</body>
</html>
