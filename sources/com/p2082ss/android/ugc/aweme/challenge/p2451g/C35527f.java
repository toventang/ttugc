package com.p2082ss.android.ugc.aweme.challenge.p2451g;

import android.os.Message;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.g.f */
public final class C35527f extends AbstractC39085b<SearchSugChallengeList> {

    /* renamed from: a */
    public static final C35528a f83790a = new C35528a((byte) 0);

    /* renamed from: b */
    private int f83791b;

    /* renamed from: c */
    private CallableC35533k f83792c;

    static {
        Covode.recordClassIndex(42723);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.g.f$a */
    public static final class C35528a {
        static {
            Covode.recordClassIndex(42724);
        }

        private C35528a() {
        }

        public /* synthetic */ C35528a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* bridge */ /* synthetic */ void handleData(SearchSugChallengeList searchSugChallengeList) {
        if (searchSugChallengeList != null) {
            this.mData = searchSugChallengeList;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C89219l.m154721d(message, "");
        if (message.what != this.f83791b) {
            this.mHandler.removeMessages(message.what);
            return;
        }
        if (message.obj instanceof Exception) {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            Exception exc = (Exception) obj;
            if (exc.getMessage() != null) {
                C73991bj.m130131b("challenge search failed, message:" + exc.getMessage());
            }
            C73991bj.m130131b("challenge search failed, stack trace:" + Log.getStackTraceString(exc));
        }
        if (!(message.obj instanceof C35532j)) {
            super.handleMsg(message);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (C80580in.m139687c()) {
            return false;
        }
        if (!super.sendRequest(objArr[0], objArr[1])) {
            return false;
        }
        this.f83791b = (this.f83791b + 1) % 10;
        CallableC35533k kVar = this.f83792c;
        if (kVar != null) {
            kVar.f83794a = true;
        }
        this.f83792c = new CallableC35533k(this, objArr);
        C34608n.m70658a().mo61083a(this.mHandler, this.f83792c, this.f83791b);
        return true;
    }
}
