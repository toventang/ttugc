package p4628j.p4629a.p4630a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: j.a.a.c */
public abstract class AbstractC89396c<T, VH extends RecyclerView.ViewHolder> {

    /* renamed from: e */
    public C89399f f203059e;

    static {
        Covode.recordClassIndex(105480);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract VH mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: a */
    public void mo11656a(VH vh) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10140a(VH vh, T t);

    /* renamed from: b */
    public void mo11658b(VH vh) {
    }

    /* renamed from: c */
    public void mo11659c(VH vh) {
    }

    /* renamed from: a */
    public void mo10468a(VH vh, T t, List<Object> list) {
        mo10140a(vh, t);
    }
}
