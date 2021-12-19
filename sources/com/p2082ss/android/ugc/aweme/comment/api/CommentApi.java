package com.p2082ss.android.ugc.aweme.comment.api;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.google.gson.C27910f;
import com.google.p1998c.p1999a.C27254p;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.C34269a;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.p2082ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p2082ss.android.ugc.aweme.comment.model.CommentPublishRequestModel;
import com.p2082ss.android.ugc.aweme.comment.model.CommentResponse;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36497f;
import com.p2082ss.android.ugc.aweme.comment.preload.CommentPreloadRequest;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.net.cache.C61318d;
import com.p2082ss.android.ugc.aweme.net.cache.C61321f;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.comment.api.CommentApi */
public final class CommentApi {

    /* renamed from: a */
    static final AbstractC18099f f85689a = C18097a.m33697a(C29736b.f70924e);

    /* renamed from: com.ss.android.ugc.aweme.comment.api.CommentApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(43528);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/comment/delete/")
        AbstractFutureC27655q<BaseCommentResponse> deleteComment(@AbstractC89736t(mo144292a = "cid") String str, @AbstractC89736t(mo144292a = "channel_id") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/comment/delete/")
        AbstractFutureC27655q<BaseCommentResponse> deleteComment(@AbstractC89736t(mo144292a = "cid") String str, @AbstractC89736t(mo144292a = "channel_id") int i, @AbstractC89736t(mo144292a = "action") int i2);

        @AbstractC89722f(mo144276a = "/aweme/v1/comment/digg/")
        AbstractFutureC27655q<BaseCommentResponse> diggComment(@AbstractC89736t(mo144292a = "cid") String str, @AbstractC89736t(mo144292a = "aweme_id") String str2, @AbstractC89736t(mo144292a = "digg_type") String str3, @AbstractC89736t(mo144292a = "channel_id") int i);

        @AbstractC89722f(mo144276a = "/aweme/v1/comment/list/")
        AbstractFutureC27655q<CommentItemList> fetchCommentList(@AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "comment_style") int i2, @AbstractC89736t(mo144292a = "digged_cid") String str2, @AbstractC89736t(mo144292a = "insert_cids") String str3, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str4);

        @AbstractC89722f(mo144276a = "/aweme/v2/comment/list/")
        C1731i<CommentItemList> fetchCommentListV2(@AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "insert_ids") String str2, @AbstractC89736t(mo144292a = "forward_page_type") int i2, @AbstractC89736t(mo144292a = "ad_creative_id") Long l, @AbstractC89736t(mo144292a = "channel_id") int i3, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str3, @AbstractC89736t(mo144292a = "ad_pricing_type") int i4, @AbstractC21996d Object obj, @AbstractC22004l List<C22027b> list);

        @AbstractC89722f(mo144276a = "/aweme/v1/comment/story/replylist/")
        AbstractFutureC27655q<CommentItemList> fetchStoryReplyCommentList(@AbstractC89736t(mo144292a = "comment_id") String str, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str2);

        @AbstractC89722f(mo144276a = "/aweme/v1/comment/list/reply/")
        C1731i<CommentItemList> loadMoreCommentList(@AbstractC89736t(mo144292a = "comment_id") String str, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "top_ids") String str2, @AbstractC89736t(mo144292a = "item_id") String str3, @AbstractC89736t(mo144292a = "insert_ids") String str4, @AbstractC89736t(mo144292a = "channel_id") int i2, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str5);

        @AbstractC89722f(mo144276a = "/aweme/v2/comment/list/")
        AbstractFutureC27655q<CommentItemList> preloadCommentList(@AbstractC89736t(mo144292a = "aweme_id") String str, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "insert_ids") String str2, @AbstractC89736t(mo144292a = "forward_page_type") int i2, @AbstractC89736t(mo144292a = "ad_creative_id") Long l, @AbstractC89736t(mo144292a = "channel_id") int i3, @AbstractC89736t(mo144292a = "user_avatar_shrink") String str3, @AbstractC89736t(mo144292a = "ad_pricing_type") int i4, @AbstractC21996d Object obj);

        @AbstractC89731o(mo144285a = "/aweme/v1/comment/publish/")
        @AbstractC89721e
        AbstractFutureC27655q<CommentResponse> publishComment(@AbstractC89719c(mo144273a = "aweme_id") String str, @AbstractC89719c(mo144273a = "text") String str2, @AbstractC89719c(mo144273a = "reply_id") String str3, @AbstractC89719c(mo144273a = "text_extra") String str4, @AbstractC89719c(mo144273a = "is_self_see") int i, @AbstractC89719c(mo144273a = "reply_to_reply_id") String str5, @AbstractC89719c(mo144273a = "channel_id") int i2, @AbstractC89719c(mo144273a = "action_type") int i3, @AbstractC89719c(mo144273a = "ad_info") String str6);

        @AbstractC89731o(mo144285a = "/aweme/v1/comment/publish/")
        @AbstractC89721e
        AbstractFutureC27655q<CommentResponse> publishCommentCheck(@AbstractC89719c(mo144273a = "aweme_id") String str, @AbstractC89719c(mo144273a = "text") String str2, @AbstractC89719c(mo144273a = "reply_id") String str3, @AbstractC89719c(mo144273a = "text_extra") String str4, @AbstractC89719c(mo144273a = "is_self_see") int i, @AbstractC89719c(mo144273a = "reply_to_reply_id") String str5, @AbstractC89719c(mo144273a = "channel_id") int i2, @AbstractC89719c(mo144273a = "action_type") int i3, @AbstractC89719c(mo144273a = "ad_info") String str6, @AbstractC89719c(mo144273a = "skip_rethink") int i4);

        @AbstractC89731o(mo144285a = "/tiktok/v1/gift/send/")
        @AbstractC89721e
        AbstractFutureC27655q<CommentResponse> publishGiftComment(@AbstractC89719c(mo144273a = "gift_id") String str, @AbstractC89719c(mo144273a = "aweme_id") String str2, @AbstractC89719c(mo144273a = "comment_publish_request") String str3);

        @AbstractC89731o(mo144285a = "/tiktok/v1/gift/send/")
        @AbstractC89721e
        AbstractFutureC27655q<CommentResponse> publishGiftOnlyComment(@AbstractC89719c(mo144273a = "gift_id") String str, @AbstractC89719c(mo144273a = "aweme_id") String str2);
    }

    /* renamed from: a */
    public static CommentPreloadRequest m73900a(String str, long j, int i, String str2, Long l, int i2, Object obj) {
        Aweme d = AwemeService.m70060b().mo60690d(str);
        if (l == null) {
            l = (d == null || d.getAwemeRawAd() == null || C37699a.m76221X(d)) ? null : d.getAwemeRawAd().getCreativeId();
        }
        int chargeType = (d == null || d.getAwemeRawAd() == null) ? 0 : d.getAwemeRawAd().getChargeType();
        CommentPreloadRequest.C36950a aVar = new CommentPreloadRequest.C36950a(str);
        aVar.f87005b = j;
        aVar.f87006c = i;
        aVar.f87007d = str2;
        aVar.f87008e = 1;
        aVar.f87009f = l;
        aVar.f87010g = i2;
        aVar.f87011h = m73901a();
        aVar.f87012i = chargeType;
        aVar.f87013j = obj;
        return new CommentPreloadRequest(aVar, (byte) 0);
    }

    /* renamed from: a */
    private static String m73901a() {
        int[] a = C80397em.m139369a(100);
        if (a == null) {
            return "";
        }
        return a[0] + "_" + a[1];
    }

    /* renamed from: a */
    private static String m73902a(String str) {
        Aweme a;
        if (TextUtils.isEmpty(str) || "0".equals(str) || (a = C34269a.m70081a().mo60697a(str)) == null || !a.isAd() || a.getAwemeRawAd().getAdId() == null) {
            return null;
        }
        Long adId = a.getAwemeRawAd().getAdId();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_id", adId);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    static {
        Covode.recordClassIndex(43527);
    }

    /* renamed from: a */
    public static Bundle m73892a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static CommentResponse m73903b(C36497f fVar) {
        try {
            CommentPublishRequestModel a = m73898a(fVar, 0);
            if (C27254p.m54261a(fVar.f86272b)) {
                return ((RealApi) f85689a.mo28858a(RealApi.class)).publishGiftOnlyComment(String.valueOf(fVar.f86282l), fVar.f86271a).get();
            }
            CommentResponse commentResponse = ((RealApi) f85689a.mo28858a(RealApi.class)).publishGiftComment(String.valueOf(fVar.f86282l), fVar.f86271a, GsonHolder.m138943c().mo123620b().mo46674b(a)).get();
            commentResponse.comment.setLabelInfo(commentResponse.starFakeLabel);
            commentResponse.comment.setFakeId(fVar.f86279i);
            return commentResponse;
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static CommentResponse m73899a(C36497f fVar) {
        CommentResponse commentResponse;
        try {
            if (fVar.f86282l != 0 && !C27254p.m54261a(fVar.f86281k)) {
                return m73903b(fVar);
            }
            C27910f b = GsonHolder.m138943c().mo123620b();
            CommentPublishRequestModel a = m73898a(fVar, 0);
            String str = "[]";
            if (fVar.f86367p == -1) {
                RealApi realApi = (RealApi) f85689a.mo28858a(RealApi.class);
                String aid = a.getAid();
                String text = a.getText();
                String replyId = a.getReplyId();
                if (a.getTextExtraList() != null) {
                    str = b.mo46674b(a.getTextExtraList());
                }
                commentResponse = realApi.publishComment(aid, text, replyId, str, a.getIsSelfSee(), a.getReplyToReplyId(), a.getChannelId(), a.getActionType(), a.getAdInfo()).get();
            } else {
                RealApi realApi2 = (RealApi) f85689a.mo28858a(RealApi.class);
                String aid2 = a.getAid();
                String text2 = a.getText();
                String replyId2 = a.getReplyId();
                if (a.getTextExtraList() != null) {
                    str = b.mo46674b(a.getTextExtraList());
                }
                commentResponse = realApi2.publishCommentCheck(aid2, text2, replyId2, str, a.getIsSelfSee(), a.getReplyToReplyId(), a.getChannelId(), a.getActionType(), a.getAdInfo(), fVar.f86367p).get();
            }
            commentResponse.comment.setLabelInfo(commentResponse.starFakeLabel);
            commentResponse.comment.setFakeId(fVar.f86279i);
            commentResponse.comment.setStoryEmojiComment(fVar.f86368q);
            return commentResponse;
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BaseCommentResponse m73895a(String str, int i) {
        try {
            return ((RealApi) f85689a.mo28858a(RealApi.class)).deleteComment(str, i).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.comment.model.CommentPublishRequestModel */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static CommentPublishRequestModel m73898a(C36497f fVar, int i) {
        CommentPublishRequestModel commentPublishRequestModel = new CommentPublishRequestModel();
        commentPublishRequestModel.setAid(fVar.f86271a);
        commentPublishRequestModel.setText(fVar.f86272b);
        commentPublishRequestModel.setReplyId(fVar.f86273c);
        commentPublishRequestModel.setStructList(fVar.f86274d);
        commentPublishRequestModel.setIsSelfSee(0);
        commentPublishRequestModel.setReplyToReplyId(fVar.f86275e);
        commentPublishRequestModel.setChannelId(fVar.f86277g);
        commentPublishRequestModel.setActionType(0);
        commentPublishRequestModel.setAdInfo(m73902a(fVar.f86271a));
        return commentPublishRequestModel;
    }

    /* renamed from: a */
    public static BaseCommentResponse m73896a(String str, int i, int i2) {
        try {
            return ((RealApi) f85689a.mo28858a(RealApi.class)).deleteComment(str, i, i2).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BaseCommentResponse m73897a(String str, String str2, String str3, int i) {
        try {
            return ((RealApi) f85689a.mo28858a(RealApi.class)).diggComment(str, str2, str3, i).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C1731i<CommentItemList> m73893a(String str, long j, int i, String str2, Long l, int i2) {
        C61321f fVar;
        Aweme b = AwemeService.m70060b().mo60684b(str);
        if (b == null || b.getPreload() == null || b.getPreload().commentPreload < 0) {
            fVar = null;
        } else {
            fVar = new C61321f();
            C61318d dVar = new C61318d();
            dVar.f139265a = "cache_comment";
            dVar.f139267c = 100000;
            dVar.f139266b = 1;
            fVar.f139271v = dVar;
        }
        CommentPreloadRequest a = m73900a(str, j, i, str2, l, i2, fVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C22027b("check_preload", "true"));
        return ((RealApi) f85689a.mo28858a(RealApi.class)).fetchCommentListV2(a.f86994a, a.f86995b, a.f86996c, a.f86997d, a.f86998e, a.f86999f, a.f87000g, a.f87001h, a.f87002i, a.f87003j, arrayList);
    }

    /* renamed from: a */
    public static C1731i<CommentItemList> m73894a(String str, long j, int i, String str2, String str3, String str4, int i2) {
        return ((RealApi) f85689a.mo28858a(RealApi.class)).loadMoreCommentList(str, j, i, str2, str3, str4, i2, m73901a());
    }
}
