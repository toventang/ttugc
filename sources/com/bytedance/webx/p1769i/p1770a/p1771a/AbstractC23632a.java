package com.bytedance.webx.p1769i.p1770a.p1771a;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.webx.p1769i.C23629a;
import com.bytedance.webx.p1769i.p1770a.AbstractC23637b;
import com.bytedance.webx.p1769i.p1772b.C23638a;
import com.bytedance.webx.p1769i.p1773c.C23640a;
import com.bytedance.webx.p1769i.p1774d.C23642b;
import com.bytedance.webx.p1769i.p1774d.C23643c;
import com.bytedance.webx.p1769i.p1775e.C23651a;
import com.bytedance.webx.p1769i.p1775e.C23655d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.webx.i.a.a.a */
public abstract class AbstractC23632a implements AbstractC23637b {
    static {
        Covode.recordClassIndex(27731);
    }

    /* renamed from: c */
    protected static boolean m44680c(String str) {
        "needBuildSecLink : ".concat(String.valueOf(str));
        C23651a.m44723a("AbsSecStrategy");
        if (!C23629a.f55914c) {
            C23651a.m44723a("AbsSecStrategy");
            return false;
        } else if (!C23655d.m44731b(str)) {
            C23651a.m44723a("AbsSecStrategy");
            return false;
        } else {
            C23640a aVar = C23629a.f55913b;
            if (!(aVar.f55938d == null || str == null)) {
                for (String str2 : aVar.f55938d) {
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        Uri parse = Uri.parse(str);
                        if (TextUtils.equals(parse.getHost(), str2) || parse.getHost().endsWith(".".concat(String.valueOf(str2)))) {
                            C23651a.m44723a("AbsSecStrategy");
                            return false;
                        }
                    }
                }
            }
            C23642b b = C23638a.m44697a().mo39060b(str);
            if (b == null || b.f55942c) {
                if (System.currentTimeMillis() - C23643c.m44704a().f55952d >= C23643c.f55947g) {
                    return true;
                }
                C23651a.m44723a("AbsSecStrategy");
                return false;
            }
            try {
                new JSONObject().put("url", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C23651a.m44723a("AbsSecStrategy");
            return false;
        }
    }

    /* renamed from: a */
    protected static boolean m44679a(WebView webView, boolean z) {
        WebBackForwardList copyBackForwardList;
        WebHistoryItem currentItem;
        if (!(!C23629a.f55914c || (copyBackForwardList = webView.copyBackForwardList()) == null || (currentItem = copyBackForwardList.getCurrentItem()) == null || C23629a.f55913b == null)) {
            if (currentItem.getUrl().startsWith(C23629a.f55913b.f55937c)) {
                return webView.canGoBackOrForward(-2);
            }
            if (copyBackForwardList.getSize() == 2 && C23655d.m44729a(copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl())) {
                return webView.canGoBackOrForward(-2);
            }
        }
        return z;
    }
}
