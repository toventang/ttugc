package com.p2082ss.android.ugc.aweme.favorites.p2924f;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.experiment.C46794ck;
import com.p2082ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.f.a */
public final class C47426a extends C39088c<AbstractC39085b<BaseResponse>, AbstractC47430d> {

    /* renamed from: a */
    public int f110156a;

    /* renamed from: b */
    public int f110157b;

    /* renamed from: c */
    public String f110158c = "";

    /* renamed from: d */
    public String f110159d;

    static {
        Covode.recordClassIndex(56039);
    }

    public C47426a() {
        mo67838a(new AbstractC39085b<BaseResponse>() {
            /* class com.p2082ss.android.ugc.aweme.favorites.p2924f.C47426a.C474271 */

            static {
                Covode.recordClassIndex(56040);
            }

            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 3) {
                    return false;
                }
                return true;
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
            @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean sendRequest(java.lang.Object... r8) {
                /*
                // Method dump skipped, instructions count: 182
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2924f.C47426a.C474271.sendRequest(java.lang.Object[]):boolean");
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: c */
    public final void mo57528c() {
        T t;
        int i = this.f110157b;
        int i2 = R.string.t_;
        if (i == 6) {
            if (this.f110156a == 2) {
                ((AbstractC47430d) this.f92287i).mo62589a(C17879g.m33104a().getString(R.string.t_));
            }
        } else if ((i == 1 && !TextUtils.equals(this.f110158c, "single_song") && !TextUtils.equals(this.f110158c, "similar_song")) || this.f110157b == 2) {
            if (this.f110157b == 2 && C46794ck.m90139a()) {
                FavoriteServiceImpl.m90551a().mo79762a(this.f110159d);
            }
            if (this.f110157b == 2 && this.f110156a == 1 && C46794ck.m90139a()) {
                FavoriteServiceImpl.m90551a().mo79761a((ActivityC0945e) C17873f.m33102j(), this.f110159d, this.f110158c);
            } else {
                if (this.f110156a == 1) {
                    i2 = R.string.ta;
                }
                ((AbstractC47430d) this.f92287i).mo62589a(C17879g.m33104a().getString(i2));
            }
        }
        if (this.f92287i != null) {
            if (this.f92286h == null) {
                t = null;
            } else {
                t = this.f92286h.mData;
            }
            ((AbstractC47430d) this.f92287i).mo62587a((BaseResponse) t);
        }
        if (!Keva.getRepo("collect").getBoolean("first_favourite_success", false) && this.f110156a == 1) {
            Keva.getRepo("collect").storeBoolean("first_favourite_success", true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        int i = this.f110157b;
        int i2 = R.string.ah3;
        if (i == 5) {
            C34485a aVar = (C34485a) exc;
            if (aVar.getErrorCode() == 4) {
                ((AbstractC47430d) this.f92287i).mo62589a(aVar.getErrorMsg());
            } else {
                if (this.f110156a != 1) {
                    i2 = R.string.a92;
                }
                ((AbstractC47430d) this.f92287i).mo62589a(C17879g.m33104a().getString(i2));
            }
        } else {
            if (this.f110156a != 1) {
                i2 = R.string.a92;
            }
            ((AbstractC47430d) this.f92287i).mo62589a(C17879g.m33104a().getString(i2));
        }
        if (this.f92287i != null) {
            ((AbstractC47430d) this.f92287i).mo62592e_(exc);
        }
    }
}
