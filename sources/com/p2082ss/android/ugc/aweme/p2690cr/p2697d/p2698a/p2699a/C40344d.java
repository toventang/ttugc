package com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.p2699a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.C40347a;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2700b.p2701a.C40348a;
import com.p2082ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.d.a.a.d */
public final class C40344d extends AbstractC40342b {
    static {
        Covode.recordClassIndex(48145);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.p2699a.AbstractC40342b
    /* renamed from: a */
    public final long mo69487a() {
        String str;
        String str2;
        PhotoMovieContext photoMovieContext = this.f94516a.f100903c;
        String str3 = null;
        if (photoMovieContext != null) {
            str = photoMovieContext.mFinalVideoTmpPath;
        } else {
            str = null;
        }
        long a = m81514a(str) + 0;
        PhotoMovieContext photoMovieContext2 = this.f94516a.f100903c;
        if (photoMovieContext2 != null) {
            str2 = photoMovieContext2.mOutputVideoPath;
        } else {
            str2 = null;
        }
        long a2 = a + m81514a(str2);
        PhotoMovieContext photoMovieContext3 = this.f94516a.f100903c;
        if (photoMovieContext3 != null) {
            str3 = photoMovieContext3.mInputAudioPath;
        }
        return a2 + m81514a(str3);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.p2699a.AbstractC40342b
    /* renamed from: b */
    public final long mo69488b() {
        String str;
        String str2;
        PhotoMovieContext photoMovieContext = this.f94516a.f100903c;
        if (photoMovieContext != null) {
            str = photoMovieContext.mMusicPath;
        } else {
            str = null;
        }
        long a = m81514a(str) + 0;
        PhotoMovieContext photoMovieContext2 = this.f94516a.f100903c;
        if (photoMovieContext2 == null || (str2 = photoMovieContext2.mFilterPath) == null) {
            str2 = "";
        }
        if (str2.length() <= 0) {
            return a;
        }
        C40348a aVar = new C40348a(null, null, 3);
        C40347a aVar2 = new C40347a();
        aVar2.mo69491a(aVar);
        aVar2.mo69493a(str2);
        return a + aVar.f94521a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40344d(C43223c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }
}
