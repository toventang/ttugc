package com.bytedance.ugc.p1744a.p1745a;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.UGCTools;
import com.bytedance.ugc.p1744a.C23500c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ugc.a.a.d */
public final class C23493d extends C23500c.AbstractC23506e<TextView> {

    /* renamed from: a */
    public static final C23493d f55699a = new C23493d();

    private C23493d() {
    }

    static {
        Covode.recordClassIndex(27495);
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23506e
    /* renamed from: b */
    public final /* synthetic */ TextView mo38238b(View view) {
        C89219l.m154719c(view, "");
        if (!(view instanceof TextView)) {
            view = null;
        }
        return (TextView) view;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
    @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23506e
    /* renamed from: a */
    public final /* synthetic */ int mo38237a(TextView textView) {
        String str;
        TextView textView2 = textView;
        C89219l.m154719c(textView2, "");
        CharSequence text = textView2.getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (UGCTools.isEmpty(str)) {
            return 0;
        }
        return 1;
    }
}
