<template>
  <div class="w-full flex flex-col justify-center items-center h-full ">
      <div class="gap-6 flex flex-col">

          <p>{{challengeText}}</p>
          <input :value="userInput" @input="recordTyping" type="text" placeholder="Type here" :style="{color: inputTextColor}" class="input  input-bordered input-primary   w-full" />
      </div>
  </div>
</template>

<script setup>
    import {ref} from "vue"
    let userInput = ref("")
    let inputTextColor = ref("green")
    const challengeText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
   function recordTyping(e){
        userInput = e.target.value;
        if(userInput != challengeText.substring(0,userInput.length)){
            inputTextColor.value = "red"
        }
        else{
            inputTextColor.value = "green"
        }
    }
</script>

<style></style>
