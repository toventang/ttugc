package com.p2082ss.android.ugc.aweme.p2282ad.feed.mask;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.view.AdTagGroup;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.j */
public final class C33323j extends AbstractView$OnClickListenerC33314d {
    static {
        Covode.recordClassIndex(40156);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractView$OnClickListenerC33314d
    /* renamed from: c */
    public final void mo59312c() {
        String[] appCategory;
        AwemeRawAd awemeRawAd = this.f79149b.getAwemeRawAd();
        if (!(awemeRawAd == null || (appCategory = awemeRawAd.getAppCategory()) == null)) {
            View findViewById = mo59308a(this.f79152e, R.layout.af_).findViewById(R.id.g4);
            C89219l.m154716b(findViewById, "");
            AdTagGroup adTagGroup = (AdTagGroup) findViewById;
            if (appCategory.length == 0) {
                adTagGroup.setVisibility(8);
            } else {
                ArrayList arrayList = new ArrayList();
                for (String str : appCategory) {
                    if (str.length() <= 6) {
                        arrayList.add(str);
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                C89219l.m154716b(array, "");
                adTagGroup.setTagList((String[]) array);
            }
            adTagGroup.setOnClickListener(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractView$OnClickListenerC33314d
    /* renamed from: a */
    public final void mo59310a(View view) {
        Integer valueOf;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null && valueOf.intValue() == R.id.g4) {
            this.f79150c.mo59294a(15);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33323j(LinearLayout linearLayout, C33313c cVar) {
        super(linearLayout, cVar);
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(cVar, "");
    }
}
