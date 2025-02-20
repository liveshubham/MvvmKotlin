class Discount{
fun applyBuyXGetYDiscount(cartItems: MutableList<CartItem>, discounts: List<Discount>) {
    for (discount in discounts) {
        val eligibleItems = cartItems.filter { it.productId in discount.applicableProducts }
        val eligibleQuantity = eligibleItems.sumOf { it.quantity }
        
        if (eligibleQuantity >= discount.triggerQuantity) {
            val rewardCount = (eligibleQuantity / discount.triggerQuantity) * discount.rewardQuantity
            
            for (rewardProductId in discount.rewardProducts) {
                val existingReward = cartItems.find { it.productId == rewardProductId && it.isReward }
                
                when (discount.discountType) {
                    "BOGO", "BuyXGetYFree" -> {
                        if (existingReward != null) {
                            existingReward.quantity = minOf(existingReward.quantity + rewardCount, discount.maxUsagePerOrder)
                        } else {
                            cartItems.add(
                                CartItem(productId = rewardProductId, quantity = rewardCount, price = 0.0, isReward = true)
                            )
                        }
                    }
                    "BuyXGetYDiscounted" -> {
                        existingReward?.let {
                            it.price = discount.discountedPrice ?: it.price
                        } ?: run {
                            cartItems.add(
                                CartItem(productId = rewardProductId, quantity = rewardCount, price = discount.discountedPrice ?: 0.0, isReward = true)
                            )
                        }
                    }
                    "CategoryBased" -> {
                        val categoryItems = cartItems.filter { it.categoryId in discount.applicableCategories }
                        if (categoryItems.isNotEmpty()) {
                            cartItems.add(
                                CartItem(productId = rewardProductId, quantity = rewardCount, price = 0.0, isReward = true)
                            )
                        }
                    }
                }
            }
        }
    }
}
}
