package com.p2082ss.android.ugc.aweme.feed.caption.edit;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.CaptionEditApi */
public final class CaptionEditApi {

    /* renamed from: a */
    public static ICaptionEditApi f113446a;

    /* renamed from: b */
    public static final C49358a f113447b = new C49358a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.CaptionEditApi$ICaptionEditApi */
    public interface ICaptionEditApi {
        static {
            Covode.recordClassIndex(58161);
        }

        @AbstractC22000h(mo35789a = "/tiktok/cla/next_translation_candidate/get/v1/")
        AbstractC88979t<EdtCaptionModel> getNewTask();

        @AbstractC22000h(mo35789a = "/tiktok/cla/translation_edit/get/v1/")
        AbstractC88979t<EdtCaptionModel> queryAwemeAndCaption(@AbstractC22018z(mo35807a = "subtitle_id") String str);

        @AbstractC22012t(mo35799a = "/tiktok/cla/translation_edit/create/v1/")
        @AbstractC21999g
        AbstractC88979t<BaseResponse> updateTranslation(@AbstractC21998f LinkedHashMap<String, String> linkedHashMap);
    }

    static {
        Covode.recordClassIndex(58160);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.CaptionEditApi$a */
    public static final class C49358a {
        static {
            Covode.recordClassIndex(58162);
        }

        private C49358a() {
        }

        /* renamed from: a */
        public static AbstractC88979t<EdtCaptionModel> m92444a() {
            try {
                return m92447b().getNewTask();
            } catch (ExecutionException e) {
                AbstractC34479a.getCompatibleException(e);
                AbstractC88979t<EdtCaptionModel> a = C88925a.m154171a(C88790v.f201616a);
                C89219l.m154716b(a, "");
                return a;
            }
        }

        /* renamed from: b */
        private static ICaptionEditApi m92447b() {
            if (CaptionEditApi.f113446a == null) {
                CaptionEditApi.f113446a = (ICaptionEditApi) RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(ICaptionEditApi.class);
            }
            ICaptionEditApi iCaptionEditApi = CaptionEditApi.f113446a;
            if (iCaptionEditApi == null) {
                C89219l.m154715b();
            }
            return iCaptionEditApi;
        }

        public /* synthetic */ C49358a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC88979t<EdtCaptionModel> m92445a(String str) {
            C89219l.m154721d(str, "");
            try {
                return m92447b().queryAwemeAndCaption(str);
            } catch (ExecutionException e) {
                AbstractC34479a.getCompatibleException(e);
                AbstractC88979t<EdtCaptionModel> a = C88925a.m154171a(C88790v.f201616a);
                C89219l.m154716b(a, "");
                return a;
            }
        }

        /* renamed from: a */
        public static AbstractC88979t<BaseResponse> m92446a(String str, List<CaptionData> list, List<CaptionData> list2) {
            C89219l.m154721d(str, "");
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (CaptionData captionData : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("start_time", captionData.getStartTime());
                    jSONObject.put("end_time", captionData.getEndTime());
                    jSONObject.put("text", captionData.getText());
                    jSONObject.put("gender", captionData.getGender());
                    jSONArray.put(jSONObject);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            if (list2 != null) {
                for (CaptionData captionData2 : list2) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("start_time", captionData2.getStartTime());
                    jSONObject2.put("end_time", captionData2.getEndTime());
                    jSONObject2.put("text", captionData2.getText());
                    jSONObject2.put("gender", captionData2.getGender());
                    jSONArray2.put(jSONObject2);
                }
            }
            try {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put("subtitle_id", str);
                String jSONArray3 = jSONArray.toString();
                C89219l.m154716b(jSONArray3, "");
                linkedHashMap.put("trans_subtitle", jSONArray3);
                String jSONArray4 = jSONArray2.toString();
                C89219l.m154716b(jSONArray4, "");
                linkedHashMap.put("src_subtitle", jSONArray4);
                return m92447b().updateTranslation(linkedHashMap);
            } catch (ExecutionException e) {
                AbstractC34479a.getCompatibleException(e);
                AbstractC88979t<BaseResponse> a = C88925a.m154171a(C88790v.f201616a);
                C89219l.m154716b(a, "");
                return a;
            }
        }
    }
}
