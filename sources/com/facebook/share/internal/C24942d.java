package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24693ad;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.kakao.usermgmt.StringSet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.d */
public class C24942d {

    /* renamed from: a */
    public static final Pattern f59205a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    /* renamed from: a */
    static void m47810a(Bundle bundle, ShareMessengerActionButton shareMessengerActionButton, boolean z) {
        String str;
        if (!C24677a.m47209a(C24942d.class) && shareMessengerActionButton != null) {
            try {
                if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                    ShareMessengerURLActionButton shareMessengerURLActionButton = (ShareMessengerURLActionButton) shareMessengerActionButton;
                    if (!C24677a.m47209a(C24942d.class)) {
                        if (z) {
                            try {
                                str = C24693ad.m47234a(shareMessengerURLActionButton.f59281b);
                            } catch (Throwable th) {
                                C24677a.m47208a(th, C24942d.class);
                                return;
                            }
                        } else {
                            str = shareMessengerURLActionButton.f59264a + " - " + C24693ad.m47234a(shareMessengerURLActionButton.f59281b);
                        }
                        C24693ad.m47249a(bundle, "TARGET_DISPLAY", str);
                        C24693ad.m47248a(bundle, "ITEM_URL", shareMessengerURLActionButton.f59281b);
                    }
                }
            } catch (Throwable th2) {
                C24677a.m47208a(th2, C24942d.class);
            }
        }
    }

    /* renamed from: a */
    static JSONObject m47805a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put(StringSet.type, "template").put("payload", new JSONObject().put("template_type", "generic").put("sharable", shareMessengerGenericTemplateContent.f59265a).put("image_aspect_ratio", m47799a(shareMessengerGenericTemplateContent.f59266b)).put("elements", new JSONArray().put(m47806a(shareMessengerGenericTemplateContent.f59267c)))));
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    /* renamed from: a */
    static JSONObject m47808a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put(StringSet.type, "template").put("payload", new JSONObject().put("template_type", "open_graph").put("elements", new JSONArray().put(m47812b(shareMessengerOpenGraphMusicTemplateContent)))));
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    /* renamed from: a */
    static JSONObject m47807a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        try {
            return new JSONObject().put("attachment", new JSONObject().put(StringSet.type, "template").put("payload", new JSONObject().put("template_type", "media").put("elements", new JSONArray().put(m47811b(shareMessengerMediaTemplateContent)))));
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m47806a(ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("title", shareMessengerGenericTemplateElement.f59269a).put("subtitle", shareMessengerGenericTemplateElement.f59270b).put("image_url", C24693ad.m47234a(shareMessengerGenericTemplateElement.f59271c));
            if (shareMessengerGenericTemplateElement.f59273e != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(m47803a(shareMessengerGenericTemplateElement.f59273e));
                put.put("buttons", jSONArray);
            }
            if (shareMessengerGenericTemplateElement.f59272d != null) {
                put.put("default_action", m47804a(shareMessengerGenericTemplateElement.f59272d, true));
            }
            return put;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m47809a(ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) {
        String str;
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put(StringSet.type, "web_url");
            if (z) {
                str = null;
            } else {
                str = shareMessengerURLActionButton.f59264a;
            }
            return put.put("title", str).put("url", C24693ad.m47234a(shareMessengerURLActionButton.f59281b)).put("webview_height_ratio", m47801a(shareMessengerURLActionButton.f59285f)).put("messenger_extensions", shareMessengerURLActionButton.f59283d).put("fallback_url", C24693ad.m47234a(shareMessengerURLActionButton.f59282c)).put("webview_share_button", m47802a(shareMessengerURLActionButton));
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(30246);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.share.internal.d$1 */
    public static /* synthetic */ class C249431 {

        /* renamed from: a */
        static final /* synthetic */ int[] f59206a;

        /* renamed from: b */
        static final /* synthetic */ int[] f59207b;

        /* renamed from: c */
        static final /* synthetic */ int[] f59208c;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0039 */
        static {
            /*
                r0 = 30247(0x7627, float:4.2385E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.share.model.ShareMessengerMediaTemplateContent$a[] r0 = com.facebook.share.model.ShareMessengerMediaTemplateContent.EnumC24985a.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.facebook.share.internal.C24942d.C249431.f59208c = r1
                r2 = 1
                com.facebook.share.model.ShareMessengerMediaTemplateContent$a r0 = com.facebook.share.model.ShareMessengerMediaTemplateContent.EnumC24985a.VIDEO     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                com.facebook.share.model.ShareMessengerGenericTemplateContent$a[] r0 = com.facebook.share.model.ShareMessengerGenericTemplateContent.EnumC24982a.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.facebook.share.internal.C24942d.C249431.f59207b = r1
                com.facebook.share.model.ShareMessengerGenericTemplateContent$a r0 = com.facebook.share.model.ShareMessengerGenericTemplateContent.EnumC24982a.SQUARE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.facebook.share.model.ShareMessengerURLActionButton$a[] r0 = com.facebook.share.model.ShareMessengerURLActionButton.EnumC24988a.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.facebook.share.internal.C24942d.C249431.f59206a = r1
                com.facebook.share.model.ShareMessengerURLActionButton$a r0 = com.facebook.share.model.ShareMessengerURLActionButton.EnumC24988a.WebviewHeightRatioCompact     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.facebook.share.internal.C24942d.C249431.f59206a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.facebook.share.model.ShareMessengerURLActionButton$a r0 = com.facebook.share.model.ShareMessengerURLActionButton.EnumC24988a.WebviewHeightRatioTall     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C24942d.C249431.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static String m47802a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        try {
            if (shareMessengerURLActionButton.f59284e) {
                return "hide";
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    /* renamed from: a */
    static String m47798a(Uri uri) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        try {
            String host = uri.getHost();
            if (C24693ad.m47261a(host) || !f59205a.matcher(host).matches()) {
                return "IMAGE";
            }
            return "uri";
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    /* renamed from: b */
    private static JSONObject m47812b(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("url", C24693ad.m47234a(shareMessengerOpenGraphMusicTemplateContent.f59279a));
            if (shareMessengerOpenGraphMusicTemplateContent.f59280b != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(m47803a(shareMessengerOpenGraphMusicTemplateContent.f59280b));
                put.put("buttons", jSONArray);
            }
            return put;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    /* renamed from: a */
    private static String m47799a(ShareMessengerGenericTemplateContent.EnumC24982a aVar) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        if (aVar == null) {
            return "horizontal";
        }
        try {
            if (C249431.f59207b[aVar.ordinal()] != 1) {
                return "horizontal";
            }
            return "square";
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    /* renamed from: b */
    private static JSONObject m47811b(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        try {
            JSONObject put = new JSONObject().put("attachment_id", shareMessengerMediaTemplateContent.f59275b).put("url", C24693ad.m47234a(shareMessengerMediaTemplateContent.f59276c)).put("media_type", m47800a(shareMessengerMediaTemplateContent.f59274a));
            if (shareMessengerMediaTemplateContent.f59277d != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(m47803a(shareMessengerMediaTemplateContent.f59277d));
                put.put("buttons", jSONArray);
            }
            return put;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    /* renamed from: a */
    static String m47800a(ShareMessengerMediaTemplateContent.EnumC24985a aVar) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        if (aVar == null) {
            return "image";
        }
        try {
            if (C249431.f59208c[aVar.ordinal()] != 1) {
                return "image";
            }
            return "video";
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    /* renamed from: a */
    private static String m47801a(ShareMessengerURLActionButton.EnumC24988a aVar) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        if (aVar == null) {
            return "full";
        }
        try {
            int i = C249431.f59206a[aVar.ordinal()];
            if (i == 1) {
                return "compact";
            }
            if (i != 2) {
                return "full";
            }
            return "tall";
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m47803a(ShareMessengerActionButton shareMessengerActionButton) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        try {
            return m47804a(shareMessengerActionButton, false);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m47804a(ShareMessengerActionButton shareMessengerActionButton, boolean z) {
        if (C24677a.m47209a(C24942d.class)) {
            return null;
        }
        try {
            if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                return m47809a((ShareMessengerURLActionButton) shareMessengerActionButton, z);
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24942d.class);
            return null;
        }
    }
}
