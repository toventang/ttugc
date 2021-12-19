package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C34406ba;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41128a;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.as */
public final class C50079as {

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.as$a */
    public interface AbstractC50080a {
        static {
            Covode.recordClassIndex(59206);
        }

        /* renamed from: a */
        void mo85216a(C41128a aVar);
    }

    static {
        Covode.recordClassIndex(59205);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.as$b */
    public static final class CallableC50081b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f115614a;

        /* renamed from: b */
        final /* synthetic */ String f115615b;

        /* renamed from: c */
        final /* synthetic */ String f115616c;

        static {
            Covode.recordClassIndex(59207);
        }

        CallableC50081b(String str, String str2, String str3) {
            this.f115614a = str;
            this.f115615b = str2;
            this.f115616c = str3;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C41128a call() {
            try {
                return C34406ba.m70397a().mo57056a("[" + this.f115614a + ']', this.f115615b, this.f115616c);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.as$c */
    public static final class C50082c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC50080a f115617a;

        static {
            Covode.recordClassIndex(59208);
        }

        C50082c(AbstractC50080a aVar) {
            this.f115617a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C41128a aVar;
            AbstractC50080a aVar2 = this.f115617a;
            if (iVar != null) {
                aVar = (C41128a) iVar.mo5545d();
            } else {
                aVar = null;
            }
            aVar2.mo85216a(aVar);
            return iVar;
        }
    }

    /* renamed from: a */
    public static String m94014a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
