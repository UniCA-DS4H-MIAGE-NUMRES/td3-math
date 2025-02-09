package fr.unica.miage.vasseur.pizzapp.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lfr/unica/miage/vasseur/pizzapp/viewmodel/PizzaViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_pizzas", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lfr/unica/miage/vasseur/pizzapp/model/Pizza;", "pizzas", "Lkotlinx/coroutines/flow/StateFlow;", "getPizzas", "()Lkotlinx/coroutines/flow/StateFlow;", "getPizza", "id", "", "loadPizzas", "", "app_debug"})
public final class PizzaViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<fr.unica.miage.vasseur.pizzapp.model.Pizza>> _pizzas = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<fr.unica.miage.vasseur.pizzapp.model.Pizza>> pizzas = null;
    
    public PizzaViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<fr.unica.miage.vasseur.pizzapp.model.Pizza>> getPizzas() {
        return null;
    }
    
    private final void loadPizzas() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final fr.unica.miage.vasseur.pizzapp.model.Pizza getPizza(int id) {
        return null;
    }
}