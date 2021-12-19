package com.bytedance.tux.p1708b.p1709a;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1708b.C22983g;
import com.bytedance.tux.p1711d.C23011a;
import com.bytedance.tux.p1722h.C23155d;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.b.a.a */
public final class C22973a extends AbstractC22974b<TextView> {

    /* renamed from: a */
    private final C22977e f54328a = new C22977e();

    static {
        Covode.recordClassIndex(26890);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.bytedance.tux.p1708b.p1709a.AbstractC22974b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo37289a(TextView textView, Map map) {
        return mo37288a(textView, (Map<Integer, ? extends Object>) map);
    }

    /* renamed from: a */
    public final Map<Integer, Object> mo37288a(TextView textView, Map<Integer, ? extends Object> map) {
        C89219l.m154719c(textView, "");
        C89219l.m154719c(map, "");
        return super.mo37289a((Object) textView, (Map<Integer, ? extends Object>) this.f54328a.mo37289a(textView, map));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    @Override // com.bytedance.tux.p1708b.p1709a.AbstractC22974b
    /* renamed from: a */
    public final /* synthetic */ boolean mo37290a(TextView textView, int i, Object obj) {
        TextView textView2 = textView;
        C89219l.m154719c(textView2, "");
        C89219l.m154719c(obj, "");
        if (i == C22983g.m43330d().f54332a) {
            C22983g.m43330d();
            C89219l.m154719c(obj, "");
            textView2.setMinHeight(((Number) obj).intValue());
            return true;
        } else if (i == C22983g.m43331e().f54332a) {
            C22983g.m43331e();
            C89219l.m154719c(obj, "");
            textView2.setWidth(((Number) obj).intValue());
            return true;
        } else if (i == C22983g.m43332f().f54332a) {
            C22983g.m43332f();
            C89219l.m154719c(obj, "");
            textView2.setMinWidth(((Number) obj).intValue());
            return true;
        } else if (i == C22983g.m43343q().f54332a) {
            C22983g.m43343q();
            C89219l.m154719c(obj, "");
            textView2.setMaxWidth(((Number) obj).intValue());
            return true;
        } else if (i == C22983g.m43333g().f54332a) {
            Context context = textView2.getContext();
            C89219l.m154709a((Object) context, "");
            C22983g.m43333g();
            C89219l.m154719c(obj, "");
            Integer a = C23155d.m43641a(context, ((Number) obj).intValue());
            if (a != null) {
                textView2.setTextColor(a.intValue());
            }
            return true;
        } else if (i == C22983g.m43334h().f54332a) {
            C22983g.m43334h();
            C89219l.m154719c(obj, "");
            textView2.setTextSize(1, ((Number) obj).floatValue());
            return true;
        } else if (i == C22983g.m43336j().f54332a) {
            C22983g.m43336j();
            C89219l.m154719c(obj, "");
            Typeface a2 = C23011a.m43398a((String) obj);
            if (a2 != null) {
                textView2.setTypeface(a2);
            }
            return true;
        } else if (i != C22983g.m43335i().f54332a) {
            return false;
        } else {
            C22983g.m43335i();
            C89219l.m154719c(obj, "");
            C89378p pVar = (C89378p) obj;
            textView2.setTypeface(Typeface.create((String) pVar.getFirst(), ((Number) pVar.getSecond()).intValue()));
            return true;
        }
    }
}
