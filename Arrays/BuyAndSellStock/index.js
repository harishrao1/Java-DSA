

var maxProfit = function(prices) {
    
    let minPrice = prices[0];
    let maxProfit = 0;

    for(let i=0;i<prices.length;i++){

        if(prices[i] < minPrice){
            minPrice = prices[i]
        }
        else if(prices[i]-minPrice > maxProfit){
            maxProfit = prices[i]-minPrice;
        }


        // let currentProfit = prices[i] - minPrice;

        // minPrice = Math.min(minPrice,prices[i]);
        // maxProfit = Math.max(maxProfit, currentProfit);
    }
    return maxProfit;
};
