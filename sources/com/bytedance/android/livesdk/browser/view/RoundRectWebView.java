package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import com.C1764a;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.util.Map;

public class RoundRectWebView extends SSWebView {
    private boolean needCleanRadius;
    private Paint paint;
    private Path path;
    private float radius;
    private float radiusBottomLeft;
    private float radiusBottomRight;
    private float radiusTopLeft;
    private float radiusTopRight;
    private RectF rect;

    static {
        Covode.recordClassIndex(7989);
    }

    public boolean RoundRectWebView__canGoBack$___twin___() {
        return super.canGoBack();
    }

    @Override // com.bytedance.android.livesdk.browser.view.SSWebView
    public boolean canGoBack() {
        return m15152xe392dba4(this);
    }

    @Override // com.bytedance.android.livesdk.browser.view.SSWebView
    public void goBack() {
        m15153xe54cf64a(this);
    }

    @Override // com.bytedance.android.livesdk.browser.view.SSWebView
    public void loadUrl(String str) {
        m15154xce86fdae(this, str);
    }

    @Override // com.bytedance.android.livesdk.browser.view.SSWebView, android.webkit.WebView
    public void loadUrl(String str, Map map) {
        m15155xce86fdae(this, str, map);
    }

    public void RoundRectWebView__goBack$___twin___() {
        C12044i.f28862a.mo19249p(this);
        super.goBack();
    }

    public void destroy() {
        C12044i.f28862a.mo19247l(this);
        super.destroy();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        C12044i.f28862a.mo19250r(this);
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.android.livesdk.browser.view.SSWebView
    public void reload() {
        C12044i.f28862a.mo19248n(this);
        super.reload();
    }

    private void init() {
        C12044i.f28862a.mo19246j(this);
        this.path = new Path();
        this.rect = new RectF();
        Paint paint2 = new Paint(1);
        this.paint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.paint.setColor(0);
        this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* renamed from: com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_canGoBack */
    public static boolean m15152xe392dba4(RoundRectWebView roundRectWebView) {
        if (!roundRectWebView.RoundRectWebView__canGoBack$___twin___() || !C84365i.m145120a(roundRectWebView)) {
            return false;
        }
        return true;
    }

    /* renamed from: com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_goBack */
    public static void m15153xe54cf64a(RoundRectWebView roundRectWebView) {
        if (!C84365i.m145121b(roundRectWebView)) {
            roundRectWebView.RoundRectWebView__goBack$___twin___();
        }
    }

    public void RoundRectWebView__loadUrl$___twin___(String str) {
        C12044i.f28862a.mo19245g(this, str);
        super.loadUrl(str);
    }

    public void setRadius(float f) {
        this.radius = f;
        this.needCleanRadius = true;
        invalidate();
    }

    public RoundRectWebView(Context context) {
        super(context);
        init();
        if (C84367b.m145126a()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                C1764a.m5930a(settings, sb.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.radius != 0.0f) {
            this.rect.set(0.0f, (float) getScrollY(), (float) getWidth(), (float) (getScrollY() + getHeight()));
            this.path.reset();
            this.path.setFillType(Path.FillType.INVERSE_WINDING);
            Path path2 = this.path;
            RectF rectF = this.rect;
            float f = this.radius;
            path2.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
        } else if (this.radiusTopLeft != 0.0f || this.radiusTopRight != 0.0f || this.radiusBottomRight != 0.0f || this.radiusBottomLeft != 0.0f) {
            this.rect.set(0.0f, (float) getScrollY(), (float) getWidth(), (float) (getScrollY() + getHeight()));
            this.path.reset();
            this.path.setFillType(Path.FillType.INVERSE_WINDING);
            float f2 = this.radiusTopLeft;
            float f3 = this.radiusTopRight;
            float f4 = this.radiusBottomRight;
            float f5 = this.radiusBottomLeft;
            this.path.addRoundRect(this.rect, new float[]{f2, f2, f3, f3, f4, f4, f5, f5}, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
        } else if (this.needCleanRadius) {
            this.rect.set(0.0f, (float) getScrollY(), (float) getWidth(), (float) (getScrollY() + getHeight()));
            this.path.reset();
            this.path.setFillType(Path.FillType.INVERSE_WINDING);
            this.path.addRoundRect(this.rect, 0.0f, 0.0f, Path.Direction.CW);
            canvas.drawPath(this.path, this.paint);
        }
    }

    public RoundRectWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    /* renamed from: com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl */
    public static void m15154xce86fdae(RoundRectWebView roundRectWebView, String str) {
        String a = C84365i.f188614a.mo129370a(roundRectWebView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        roundRectWebView.RoundRectWebView__loadUrl$___twin___(str);
    }

    public void RoundRectWebView__loadUrl$___twin___(String str, Map<String, String> map) {
        C12044i.f28862a.mo19245g(this, str);
        super.loadUrl(str, map);
    }

    /* renamed from: com_bytedance_android_livesdk_browser_view_RoundRectWebView_com_ss_android_ugc_tiktok_security_lancet_web_SecLinkLancet_loadUrl */
    public static void m15155xce86fdae(RoundRectWebView roundRectWebView, String str, Map map) {
        String a = C84365i.f188614a.mo129370a(roundRectWebView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        roundRectWebView.RoundRectWebView__loadUrl$___twin___(str, map);
    }

    public RoundRectWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
        if (C84367b.m145126a()) {
            WebSettings settings = getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                C1764a.m5930a(settings, sb.toString());
            }
        }
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        this.radius = 0.0f;
        this.radiusTopLeft = f;
        this.radiusTopRight = f2;
        this.radiusBottomRight = f3;
        this.radiusBottomLeft = f4;
        this.needCleanRadius = true;
        invalidate();
    }
}
