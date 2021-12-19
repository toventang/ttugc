package com.p2082ss.android.ugc.aweme.detail.operators;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41225a;
import com.p2082ss.android.ugc.aweme.detail.p2750i.C41227b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.e */
public class C41285e implements AbstractC41262aa {

    /* renamed from: a */
    protected C41225a f96384a = new C41225a(1);

    /* renamed from: b */
    private String f96385b;

    /* renamed from: c */
    private C41227b f96386c = new C41227b();

    static {
        Covode.recordClassIndex(49173);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean cannotLoadMore() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public int getPageType(int i) {
        return i + 3000;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean init(Fragment fragment) {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public Object getViewModel() {
        return this.f96384a;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean isLoading() {
        return this.f96386c.mo67842j();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void unInit() {
        this.f96386c.ck_();
        this.f96386c.mo67840h();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean isDataEmpty() {
        if (this.f96384a.mData == null || C13603b.m24435a((Collection) this.f96384a.mData.f96125a)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void bindView(AbstractC41267ad adVar) {
        this.f96386c.mo67839a_(adVar);
        this.f96386c.mo67838a(this.f96384a);
    }

    public C41285e(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "[" + str + "]";
        }
        this.f96385b = str2;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public boolean deleteItem(String str) {
        Aweme b = AwemeService.m70060b().mo60684b(str);
        if (b == null) {
            b = AwemeService.m70060b().mo60679a(str);
        }
        if (b == null) {
            return false;
        }
        C41227b bVar = this.f96386c;
        if (bVar.f92286h == null || bVar.f92286h.mData == null || bVar.f92286h.mData.f96125a == null || !bVar.f92286h.mData.f96125a.remove(b)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public void request(int i, C49812b bVar, int i2, boolean z) {
        this.f96386c.mo57616a(this.f96385b, bVar.getPushParams(), bVar.getEventType());
    }
}
