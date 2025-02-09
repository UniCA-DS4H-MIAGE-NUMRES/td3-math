package fr.unica.miage.vasseur.pizzapp.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0011R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lfr/unica/miage/vasseur/pizzapp/viewmodel/CartViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_cartItems", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lfr/unica/miage/vasseur/pizzapp/viewmodel/CartItem;", "cartItems", "Lkotlinx/coroutines/flow/StateFlow;", "getCartItems", "()Lkotlinx/coroutines/flow/StateFlow;", "totalPrice", "", "getTotalPrice", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "addToCart", "", "pizza", "Lfr/unica/miage/vasseur/pizzapp/model/Pizza;", "extraCheese", "", "clearCart", "app_debug"})
public final class CartViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<fr.unica.miage.vasseur.pizzapp.viewmodel.CartItem>> _cartItems = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<fr.unica.miage.vasseur.pizzapp.viewmodel.CartItem>> cartItems = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope viewModelScope = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Double> totalPrice = null;
    
    public CartViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<fr.unica.miage.vasseur.pizzapp.viewmodel.CartItem>> getCartItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Double> getTotalPrice() {
        return null;
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull()
    fr.unica.miage.vasseur.pizzapp.model.Pizza pizza, int extraCheese) {
    }
    
    public final void clearCart() {
    }
}