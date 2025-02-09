package fr.unica.miage.vasseur.pizzapp.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lfr/unica/miage/vasseur/pizzapp/data/repository/OrderRepository;", "", "orderDao", "Lfr/unica/miage/vasseur/pizzapp/data/local/OrderDao;", "(Lfr/unica/miage/vasseur/pizzapp/data/local/OrderDao;)V", "clearOrders", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOrders", "", "Lfr/unica/miage/vasseur/pizzapp/data/local/OrderEntity;", "insertOrder", "order", "(Lfr/unica/miage/vasseur/pizzapp/data/local/OrderEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class OrderRepository {
    @org.jetbrains.annotations.NotNull()
    private final fr.unica.miage.vasseur.pizzapp.data.local.OrderDao orderDao = null;
    
    public OrderRepository(@org.jetbrains.annotations.NotNull()
    fr.unica.miage.vasseur.pizzapp.data.local.OrderDao orderDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertOrder(@org.jetbrains.annotations.NotNull()
    fr.unica.miage.vasseur.pizzapp.data.local.OrderEntity order, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllOrders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<fr.unica.miage.vasseur.pizzapp.data.local.OrderEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearOrders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}