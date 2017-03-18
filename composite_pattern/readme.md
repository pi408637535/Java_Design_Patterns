组合模式和迭代器模式模式 可以进行组合
组合模式 负责将父子模型进行统一，迭代器模式可以用来统一遍历父子类
案例：
两个餐厅，一个提供早餐(MorningRestaurant)，一个提供中餐(AfterRestaruant)。通过抽象，可以让早餐厅，午餐厅继承一个餐厅类
(Restaurant)(早餐厅，午餐厅提供不用的菜，但是该这两个餐厅具有相同的接口),在通过一个RestaurantComposite(里面还有一个List<Restaurant>属性)，这样就可以通过一个RestaurantComposite
来一次遍历这两个对象
