package fr.unica.miage.vasseur.pizzapp.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lfr/unica/miage/vasseur/pizzapp/data/local/OrderDao;", "", "clearOrders", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOrders", "", "Lfr/unica/miage/vasseur/pizzapp/data/local/OrderEntity;", "insertOrder", "", "order", "(Lfr/unica/miage/vasseur/pizzapp/data/local/OrderEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface OrderDao {
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertOrder(@org.jetbrains.annotations.NotNull()
    fr.unica.miage.vasseur.pizzapp.data.local.OrderEntity order, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM orders")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllOrders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<fr.unica.miage.vasseur.pizzapp.data.local.OrderEntity>> $completion);
    
    @androidx.room.Query(value = "DELETE FROM orders")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearOrders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}