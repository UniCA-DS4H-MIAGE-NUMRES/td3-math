package fr.unica.miage.vasseur.pizzapp.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lfr/unica/miage/vasseur/pizzapp/viewmodel/OrderViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lfr/unica/miage/vasseur/pizzapp/data/repository/OrderRepository;", "(Lfr/unica/miage/vasseur/pizzapp/data/repository/OrderRepository;)V", "_orders", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lfr/unica/miage/vasseur/pizzapp/data/local/OrderEntity;", "orders", "Lkotlinx/coroutines/flow/StateFlow;", "getOrders", "()Lkotlinx/coroutines/flow/StateFlow;", "clearOrders", "", "insertOrder", "order", "loadOrders", "app_debug"})
public final class OrderViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final fr.unica.miage.vasseur.pizzapp.data.repository.OrderRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<fr.unica.miage.vasseur.pizzapp.data.local.OrderEntity>> _orders = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<fr.unica.miage.vasseur.pizzapp.data.local.OrderEntity>> orders = null;
    
    public OrderViewModel(@org.jetbrains.annotations.NotNull()
    fr.unica.miage.vasseur.pizzapp.data.repository.OrderRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<fr.unica.miage.vasseur.pizzapp.data.local.OrderEntity>> getOrders() {
        return null;
    }
    
    public final void insertOrder(@org.jetbrains.annotations.NotNull()
    fr.unica.miage.vasseur.pizzapp.data.local.OrderEntity order) {
    }
    
    public final void loadOrders() {
    }
    
    public final void clearOrders() {
    }
}