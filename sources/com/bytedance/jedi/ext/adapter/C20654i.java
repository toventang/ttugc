package com.bytedance.jedi.ext.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.internal.C20659c;
import com.bytedance.jedi.ext.adapter.internal.C20662d;
import com.bytedance.jedi.ext.adapter.internal.C20666f;
import com.bytedance.jedi.ext.adapter.internal.C20669h;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e;
import com.bytedance.jedi.ext.adapter.p1467b.C20633f;
import com.bytedance.widget.Widget;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.i */
public final class C20654i<VH extends JediViewHolder<? extends AbstractC20467g, ?>> extends C20633f<VH> {

    /* renamed from: a */
    public final C20666f f48837a;

    /* renamed from: c */
    private final AbstractC1204m f48838c;

    static {
        Covode.recordClassIndex(24188);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.C20633f
    /* renamed from: a */
    public final /* synthetic */ AbstractC20630e mo33889a(ViewGroup viewGroup) {
        C89219l.m154719c(viewGroup, "");
        return new JediInvisibleViewHolder(viewGroup);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.C20633f
    /* renamed from: a */
    public final /* synthetic */ AbstractC20630e mo33891a(AbstractC20630e eVar) {
        JediViewHolder jediViewHolder = (JediViewHolder) eVar;
        C89219l.m154719c(jediViewHolder, "");
        JediViewHolder jediViewHolder2 = (JediViewHolder) super.mo33891a(jediViewHolder);
        AbstractC1204m mVar = this.f48838c;
        C89219l.m154719c(mVar, "");
        jediViewHolder2.f48644b = mVar;
        C20666f fVar = this.f48837a;
        C89219l.m154719c(fVar, "");
        jediViewHolder2.f48645c = fVar;
        return jediViewHolder2;
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.C20633f
    /* renamed from: a */
    public final /* synthetic */ AbstractC20630e mo33888a(int i) {
        C20669h hVar = this.f48798b.f48853c;
        Object obj = null;
        if (hVar == null) {
            return null;
        }
        List<RecyclerView.ViewHolder> list = hVar.mo33922a().get(i);
        if (list != null && (!list.isEmpty())) {
            Object obj2 = (RecyclerView.ViewHolder) list.remove(list.size() - 1);
            if (obj2 instanceof Object) {
                obj = obj2;
            }
        }
        return (JediViewHolder) obj;
    }

    public C20654i(AbstractC1204m mVar) {
        C20659c a;
        C20662d a2;
        C89219l.m154719c(mVar, "");
        this.f48838c = mVar;
        if (mVar instanceof Fragment) {
            Fragment fragment = (Fragment) mVar;
            C89219l.m154719c(fragment, "");
            a2 = C20662d.C20664a.m38914a((ActivityC0945e) null, fragment);
        } else if (mVar instanceof ActivityC0945e) {
            ActivityC0945e eVar = (ActivityC0945e) mVar;
            C89219l.m154719c(eVar, "");
            a2 = C20662d.C20664a.m38914a(eVar, (Fragment) null);
        } else if (mVar instanceof Widget) {
            Widget widget = (Widget) mVar;
            C89219l.m154719c(widget, "");
            AbstractC1196i lifecycle = widget.getLifecycle();
            C89219l.m154719c(widget, "");
            Object b = widget.mo39088j().mo39098b();
            if (b instanceof Fragment) {
                a = C20659c.C20660a.m38911a(null, (Fragment) b);
            } else if (b instanceof ActivityC0945e) {
                a = C20659c.C20660a.m38911a((ActivityC0945e) b, null);
            } else {
                throw new IllegalStateException();
            }
            a2 = C20662d.C20664a.m38915a(lifecycle, a);
        } else if (mVar instanceof JediViewHolder) {
            throw new IllegalStateException("JediViewHolder:" + mVar + " is not support for now");
        } else {
            throw new IllegalStateException("owner:" + mVar + " is not in support list ([FragmentActivity, Fragment, Widget])");
        }
        this.f48837a = new C20666f(a2);
    }
}
