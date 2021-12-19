package com.p2082ss.android.ugc.aweme.arch;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.arch.a */
public final class C33933a<T> implements AbstractC1214u<C33942b> {

    /* renamed from: a */
    protected AbstractC33936c<T> f80249a;

    /* renamed from: b */
    protected DataCenter f80250b;

    /* renamed from: c */
    private AbstractC33934a<T> f80251c;

    /* renamed from: com.ss.android.ugc.aweme.arch.a$a */
    public interface AbstractC33934a<T> {
        static {
            Covode.recordClassIndex(40854);
        }

        /* renamed from: a */
        AbstractC33936c<T> mo60167a(View view);

        /* renamed from: a */
        void mo60168a();

        /* renamed from: b */
        String mo60169b();

        /* renamed from: c */
        String mo60170c();

        /* renamed from: d */
        String mo60171d();

        /* renamed from: e */
        DataCenter mo60172e();
    }

    static {
        Covode.recordClassIndex(40853);
    }

    public C33933a(AbstractC33934a<T> aVar) {
        this.f80250b = aVar.mo60172e();
        this.f80251c = aVar;
    }

    /* renamed from: a */
    private static boolean m69470a(Object obj) {
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 1) {
                return true;
            }
            return false;
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo60166a(View view) {
        if (this.f80250b == null) {
            this.f80250b = this.f80251c.mo60172e();
        }
        if (this.f80250b != null) {
            if (!TextUtils.isEmpty(this.f80251c.mo60169b())) {
                this.f80250b.mo60189a(this.f80251c.mo60169b(), (AbstractC1214u<C33942b>) this);
            }
            if (!TextUtils.isEmpty(this.f80251c.mo60170c())) {
                this.f80250b.mo60189a(this.f80251c.mo60170c(), (AbstractC1214u<C33942b>) this);
            }
            if (!TextUtils.isEmpty(this.f80251c.mo60171d())) {
                this.f80250b.mo60189a(this.f80251c.mo60171d(), (AbstractC1214u<C33942b>) this);
            }
        }
        this.f80249a = this.f80251c.mo60167a(view);
        this.f80251c.mo60168a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        C33942b bVar2 = bVar;
        if (this.f80249a != null && bVar2 != null && !TextUtils.isEmpty(bVar2.f80277a)) {
            String str = bVar2.f80277a;
            if (TextUtils.equals(str, this.f80251c.mo60170c())) {
                if (bVar2.mo60212a() != 0) {
                    this.f80249a.mo60177b();
                }
            } else if (TextUtils.equals(str, this.f80251c.mo60171d())) {
                if (bVar2.mo60212a() == 0) {
                }
            } else if (TextUtils.equals(str, this.f80251c.mo60169b())) {
                C33935b bVar3 = (C33935b) this.f80250b.mo60192a(this.f80251c.mo60169b());
                int intValue = ((Integer) bVar3.mo60174a("action_type")).intValue();
                if (intValue == 1) {
                    this.f80249a.mo60176a((List) bVar3.mo60174a("list_data"), m69470a(bVar3.mo60174a("list_hasmore")));
                } else if (intValue == 2) {
                    this.f80249a.mo60178b((List) bVar3.mo60174a("list_data"), m69470a(bVar3.mo60174a("list_hasmore")));
                }
            }
        }
    }
}
