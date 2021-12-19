package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.favorites.model.C47478g;
import com.p2082ss.android.ugc.aweme.favorites.p2919a.C47184e;
import com.p2082ss.android.ugc.aweme.favorites.p2922d.C47420a;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.q */
public class C47731q extends AbstractC47599a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: k */
    private boolean f110640k;

    static {
        Covode.recordClassIndex(56353);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(361, new RunnableC90250g(C47731q.class, "onStickerCollectEvent", C47420a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: n */
    public final AbstractC39060f mo79782n() {
        return new C47184e();
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f110640k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: l */
    public final void mo79781l() {
        if (this.f110455j != null) {
            this.f110455j.mo67838a((AbstractC39085b) new C47478g());
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f110640k) {
            this.f110640k = false;
            mo79779c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: c */
    public final void mo79779c() {
        if (this.f110455j != null) {
            this.f110455j.mo57616a(1);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: k */
    public final void mo79780k() {
        if (this.f110455j != null) {
            this.f110455j.mo57616a(4);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47599a
    /* renamed from: q */
    public final void mo79785q() {
        C22999a aVar = new C22999a();
        aVar.f54431a = R.raw.icon_large_bookmark;
        aVar.f54435e = Integer.valueOf((int) R.attr.bd);
        this.f110451b.setStatus(new TuxStatusView.C23263c().mo37877a(aVar).mo37879a(getString(R.string.bs2)).mo37878a((CharSequence) getString(R.string.bs1)));
        this.f110451b.setVisibility(0);
    }

    @AbstractC90264r
    public void onStickerCollectEvent(C47420a aVar) {
        if (af_()) {
            List items = ((AbstractC39100a) this.f110455j.f92286h).getItems();
            C75445g gVar = aVar.f110149a;
            if (items != null && !items.isEmpty() && gVar != null) {
                if (!gVar.isFavorite) {
                    int size = items.size();
                    Iterator it = items.iterator();
                    while (it.hasNext()) {
                        C75445g gVar2 = (C75445g) it.next();
                        if (gVar2 != null && TextUtils.equals(gVar2.f169545id, gVar.f169545id)) {
                            this.f110640k = false;
                            it.remove();
                        }
                    }
                    if (size != items.size()) {
                        this.f110452c.notifyDataSetChanged();
                    } else {
                        this.f110640k = true;
                    }
                    if (items.isEmpty()) {
                        mo59525f();
                        return;
                    }
                    return;
                }
                this.f110640k = true;
            }
        }
    }
}
