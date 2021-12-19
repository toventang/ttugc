package com.bytedance.tux.p1708b.p1709a;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1708b.C22983g;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.b.a.d */
public final class C22976d extends AbstractC22974b<TuxTextView> {

    /* renamed from: a */
    private final C22973a f54329a = new C22973a();

    static {
        Covode.recordClassIndex(26893);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.bytedance.tux.p1708b.p1709a.AbstractC22974b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo37289a(TuxTextView tuxTextView, Map map) {
        return mo37291a(tuxTextView, (Map<Integer, ? extends Object>) map);
    }

    /* renamed from: a */
    public final Map<Integer, Object> mo37291a(TuxTextView tuxTextView, Map<Integer, ? extends Object> map) {
        C89219l.m154719c(tuxTextView, "");
        C89219l.m154719c(map, "");
        return super.mo37289a((Object) tuxTextView, (Map<Integer, ? extends Object>) this.f54329a.mo37288a((TextView) tuxTextView, map));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    @Override // com.bytedance.tux.p1708b.p1709a.AbstractC22974b
    /* renamed from: a */
    public final /* synthetic */ boolean mo37290a(TuxTextView tuxTextView, int i, Object obj) {
        TuxTextView tuxTextView2 = tuxTextView;
        C89219l.m154719c(tuxTextView2, "");
        C89219l.m154719c(obj, "");
        if (i != C22983g.m43338l().f54332a) {
            return false;
        }
        C22983g.m43338l();
        C89219l.m154719c(obj, "");
        tuxTextView2.setTuxFont(((Number) obj).intValue());
        return true;
    }
}
