package com.p2082ss.android.ugc.aweme.comment.preload;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17788c;
import com.bytedance.ies.powerpreload.p1243b.C17794i;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.google.p1998c.p2006h.p2007a.C27667v;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.comment.api.CommentApi;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import java.util.concurrent.Future;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.preload.CommentPreload */
public final class CommentPreload implements AbstractC17788c<CommentApi.RealApi, Future<CommentItemList>> {
    static {
        Covode.recordClassIndex(44291);
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17789d
    public final boolean enable(Bundle bundle) {
        if (bundle == null || bundle.getParcelable("comment_preload_request") == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final boolean handleException(Exception exc) {
        C89219l.m154721d(exc, "");
        exc.printStackTrace();
        return true;
    }

    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final C17794i getPreloadStrategy(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("comment_ttl")) {
            return new C17794i(0, Api.f79771d, true, 1);
        }
        return new C17794i(bundle.getInt("comment_ttl"), Api.f79771d, true);
    }

    /* Return type fixed from 'com.google.c.h.a.q<com.ss.android.ugc.aweme.comment.model.CommentItemList>' to match base method */
    @Override // com.bytedance.ies.powerpreload.p1243b.AbstractC17788c
    public final Future<CommentItemList> preload(Bundle bundle, AbstractC89172b<? super Class<CommentApi.RealApi>, ? extends CommentApi.RealApi> bVar) {
        CommentPreloadRequest commentPreloadRequest;
        C89219l.m154721d(bVar, "");
        if (bundle == null || (commentPreloadRequest = (CommentPreloadRequest) bundle.getParcelable("comment_preload_request")) == null) {
            C27667v vVar = new C27667v();
            C89219l.m154716b(vVar, "");
            return vVar;
        }
        AbstractFutureC27655q<CommentItemList> preloadCommentList = ((CommentApi.RealApi) bVar.invoke(CommentApi.RealApi.class)).preloadCommentList(commentPreloadRequest.f86994a, commentPreloadRequest.f86995b, commentPreloadRequest.f86996c, commentPreloadRequest.f86997d, commentPreloadRequest.f86998e, commentPreloadRequest.f86999f, commentPreloadRequest.f87000g, commentPreloadRequest.f87001h, commentPreloadRequest.f87002i, commentPreloadRequest.f87003j);
        C89219l.m154716b(preloadCommentList, "");
        return preloadCommentList;
    }
}
