<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--Table--%>
  <div class="overflow-x-auto rounded-lg">
    <div class="align-middle inline-block min-w-full">
      <div class="shadow overflow-hidden sm:rounded-lg">
        <table class="min-w-full divide-y divide-gray-200">
          <thead class="bg-gray-50">
          <tr>
            <th scope="col" class="p-4 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
              Transaction
            </th>
            <th scope="col" class="p-4 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
              Date & Time
            </th>
            <th scope="col" class="p-4 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
              Amount
            </th>
          </tr>
          </thead>
          <tbody class="bg-white">
          <tr>
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-900">
              Payment from <span class="font-semibold">Bonnie Green</span>
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-500">
              Apr 23 ,2021
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-semibold text-gray-900">
              $2300
            </td>
          </tr>
          <tr class="bg-gray-50">
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-900 rounded-lg rounded-left">
              Payment refund to <span class="font-semibold">#00910</span>
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-500">
              Apr 23 ,2021
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-semibold text-gray-900">
              -$670
            </td>
          </tr>
          <tr>
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-900">
              Payment failed from <span class="font-semibold">#087651</span>
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-500">
              Apr 18 ,2021
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-semibold text-gray-900">
              $234
            </td>
          </tr>
          <tr class="bg-gray-50">
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-900 rounded-lg rounded-left">
              Payment from <span class="font-semibold">Lana Byrd</span>
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-500">
              Apr 15 ,2021
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-semibold text-gray-900">
              $5000
            </td>
          </tr>
          <tr>
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-900">
              Payment from <span class="font-semibold">Jese Leos</span>
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-500">
              Apr 15 ,2021
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-semibold text-gray-900">
              $2300
            </td>
          </tr>
          <tr class="bg-gray-50">
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-900 rounded-lg rounded-left">
              Payment from <span class="font-semibold">THEMESBERG LLC</span>
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-500">
              Apr 11 ,2021
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-semibold text-gray-900">
              $560
            </td>
          </tr>
          <tr>
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-900">
              Payment from <span class="font-semibold">Lana Lysle</span>
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-normal text-gray-500">
              Apr 6 ,2021
            </td>
            <td class="p-4 whitespace-nowrap text-sm font-semibold text-gray-900">
              $1437
            </td>
          </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
<%--Statistic--%>
  <div class="mt-4 w-full grid grid-cols-1 md:grid-cols-2 xl:grid-cols-3 gap-4">
    <div class="bg-white shadow rounded-lg p-4 sm:p-6 xl:p-8 ">
      <div class="flex items-center">
        <div class="flex-shrink-0">
          <span class="text-2xl sm:text-3xl leading-none font-bold text-gray-900">2,340</span>
          <h3 class="text-base font-normal text-gray-500">New products this week</h3>
        </div>
        <div class="ml-5 w-0 flex items-center justify-end flex-1 text-green-500 text-base font-bold">
          14.6%
          <svg class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M5.293 7.707a1 1 0 010-1.414l4-4a1 1 0 011.414 0l4 4a1 1 0 01-1.414 1.414L11 5.414V17a1 1 0 11-2 0V5.414L6.707 7.707a1 1 0 01-1.414 0z" clip-rule="evenodd"></path>
          </svg>
        </div>
      </div>
    </div>
    <div class="bg-white shadow rounded-lg p-4 sm:p-6 xl:p-8 ">
      <div class="flex items-center">
        <div class="flex-shrink-0">
          <span class="text-2xl sm:text-3xl leading-none font-bold text-gray-900">5,355</span>
          <h3 class="text-base font-normal text-gray-500">Visitors this week</h3>
        </div>
        <div class="ml-5 w-0 flex items-center justify-end flex-1 text-green-500 text-base font-bold">
          32.9%
          <svg class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M5.293 7.707a1 1 0 010-1.414l4-4a1 1 0 011.414 0l4 4a1 1 0 01-1.414 1.414L11 5.414V17a1 1 0 11-2 0V5.414L6.707 7.707a1 1 0 01-1.414 0z" clip-rule="evenodd"></path>
          </svg>
        </div>
      </div>
    </div>
    <div class="bg-white shadow rounded-lg p-4 sm:p-6 xl:p-8 ">
      <div class="flex items-center">
        <div class="flex-shrink-0">
          <span class="text-2xl sm:text-3xl leading-none font-bold text-gray-900">385</span>
          <h3 class="text-base font-normal text-gray-500">User signups this week</h3>
        </div>
        <div class="ml-5 w-0 flex items-center justify-end flex-1 text-red-500 text-base font-bold">
          -2.7%
          <svg class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M14.707 12.293a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0l-4-4a1 1 0 111.414-1.414L9 14.586V3a1 1 0 012 0v11.586l2.293-2.293a1 1 0 011.414 0z" clip-rule="evenodd"></path>
          </svg>
        </div>
      </div>
    </div>
  </div>
<%-- Add folder front  --%>
<section class="bg-gray-100" x-data="{ window : 0 }">
  <div class="mx-auto max-w-screen-xl px-4 py-16 sm:px-6 lg:px-8">
    <div class="rounded-lg bg-white p-8 shadow-lg lg:col-span-3 lg:p-12">
      <form action="" class="space-y-4">
        <div>
          <label class="sr-only" for="name">CIN</label>
          <input class="w-full rounded-lg border-gray-200 p-3 text-sm" placeholder="CIN" type="text" id="name" />
        </div>

        <div class="grid grid-cols-1 gap-4 text-center sm:grid-cols-3">
          <div @click="window = 0" class="cursor-pointer">
            <span class="block w-full rounded-lg border border-gray-200 p-3" tabindex="0">
              <span class="text-sm font-medium"> medications </span>
            </span>
          </div>

          <div @click="window = 1" class="cursor-pointer">
            <span class="block w-full rounded-lg border border-gray-200 p-3" tabindex="0">
              <span class="text-sm font-medium"> prescriptions </span>
            </span>
          </div>

          <div @click="window = 2" class="cursor-pointer">
            <span class="block w-full rounded-lg border border-gray-200 p-3" tabindex="0">
              <span class="text-sm font-medium"> scanners and Radio </span>
            </span>
          </div>
        </div>
        <div>

          <div x-show="window == 0" x-data="{ medications : 0,section : 'medi' }" class="mt-12 flex flex-col space-y-4 items-center mx-4 sm:mx-0">
            <div class="py-8 px-8 mb-4 items-center rounded shadow-lg overflow-hidden w-full  hover:shadow-xl bg-white">
              <div class="flex flex-row justify-start items-center">
                <h1 class="text-lg sm:text-2xl font-bold text-gray-800 mr-2">medications</h1>
              </div>

              <div class="flex items-center inline border border-gray-200 rounded">
                <button type="button" x-on:click="medications--" :disabled="medications === 0" class="w-10 h-10 leading-10 text-gray-600 transition hover:opacity-75">
                  &minus;
                </button>

                <input type="number" id="medicationQ" x-model="medications" class="h-10 w-16 border-transparent text-center [-moz-appearance:_textfield] sm:text-sm [&::-webkit-outer-spin-button]:m-0 [&::-webkit-outer-spin-button]:appearance-none [&::-webkit-inner-spin-button]:m-0 [&::-webkit-inner-spin-button]:appearance-none" />

                <button type="button" x-on:click="medications++" class="w-10 h-10 leading-10 text-gray-600 transition hover:opacity-75">
                  &plus;
                </button>
              </div>
              <div class='my-3 flex flex-wrap -m-1'>
                <template x-for="i in medications">
                  <span class="m-1 flex flex-wrap justify-between items-center text-xs sm:text-sm bg-gray-200 hover:bg-gray-300 rounded px-4 py-2 font-bold leading-loose cursor-pointer ">
                    <input class="bg-gray-100 outline-none text-base rounded border-transparent focus:border-transparent focus:ring-0" type="text" :name="section+i" />

                  </span>
                </template>

              </div>
            </div>
          </div>

        </div>
        <div class="mt-4">
          <button type="submit" class="inline-flex w-full items-center justify-center rounded-lg bg-black px-5 py-3 text-white sm:w-auto">
            <span class="font-medium"> Send Folder </span>

            <svg xmlns="http://www.w3.org/2000/svg" class="ml-3 h-5 w-5" fill="none" viewBox="0 0 24 24" stroke="currentColor">
              <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M14 5l7 7m0 0l-7 7m7-7H3" />
            </svg>
          </button>
        </div>
      </form>
    </div>
  </div>
</section>
</body>
</html>
