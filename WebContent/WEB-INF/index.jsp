script type="text/javascript" src='js/jquery.min.js'></script>
<script type='text/javascript'>
$(document).ready(function()
{
$.ajax
({
type: "GET",
url: "GetMessages",
dataType:"json",
success: function(data)
{
if(data.Messages.length)
{
$.each(data.Messages, function(i,data)
{
var msg_data="<div id='msg"+data.msg_id+"'>"+data.message+"</div>";
$(msg_data).appendTo("#content");
});
}
else
{
$("#content").html("No Results");
}
}
});
$('#UpdateButton').click(function() 
{
// Previous Post
});
return false;
});
});
</script>
//HTML Code
<textarea id='num_control'>Nome</textarea><br/>
<textarea id='data'>Data Cadastro</textarea>
<textarea id='Nome'>Nome Completo</textarea>
<textarea id='valor'>Valor</textarea>
<textarea id='quant'>Quantidade</textarea>
<textarea id='cod_cliente'>Codigo do Cliente</textarea>
<input type='button' value=' Update ' id='UpdateButton'/>
<div id='num_control'></div>
<div id='data'></div>
<div id='Nome'></div>
<div id='valor'></div>
<div id='quant'></div>
<div id='cod_cliente'></div>