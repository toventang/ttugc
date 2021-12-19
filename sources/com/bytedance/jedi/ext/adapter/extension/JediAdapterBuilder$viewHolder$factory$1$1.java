package com.bytedance.jedi.ext.adapter.extension;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.extension.C20645b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.List;

public final class JediAdapterBuilder$viewHolder$factory$1$1 extends JediSimpleViewHolder<T> implements AbstractC33974au {

    /* renamed from: f */
    final /* synthetic */ C20645b.C20649c f48812f;

    /* renamed from: g */
    final /* synthetic */ ViewGroup f48813g;

    static {
        Covode.recordClassIndex(24176);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final void mo33817a(T t) {
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JediAdapterBuilder$viewHolder$factory$1$1(C20645b.C20649c cVar, ViewGroup viewGroup, View view) {
        super(view);
        this.f48812f = cVar;
        this.f48813g = viewGroup;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final void mo33818a(T t, int i, List<Object> list) {
        this.f48812f.f48827a.invoke(this, t, Integer.valueOf(i));
    }
}
