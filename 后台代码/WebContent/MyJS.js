$(document).ready(function(){
	$(".navbar-brand").click(function(){
		$(".welcome").fadeIn();
		$(".check").hide();
		$(".amend").hide();
		$(".delete").hide();
		$(".upload").hide();
	});
	$("#checkQuestion").click(function(){
		$(".check").fadeIn();
		$(".amend").hide();
		$(".delete").hide();
		$(".upload").hide();
		$(".welcome").hide();
	});
	$("#amendQuestion").click(function(){
		$(".amend").fadeIn();
		$(".check").hide();
		$(".delete").hide();
		$(".upload").hide();
		$(".welcome").hide();
	});
	$("#deleteQuestion").click(function(){
		$(".amend").hide();
		$(".check").hide();
		$(".delete").fadeIn();
		$(".upload").hide();
		$(".welcome").hide();
	});
	$("#uploadQuestion").click(function(){
		$(".amend").hide();
		$(".check").hide();
		$(".delete").hide();
		$(".upload").fadeIn();
		$(".welcome").hide();
	});
})
