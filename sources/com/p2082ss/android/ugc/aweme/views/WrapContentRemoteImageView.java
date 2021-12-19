package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.ss.android.ugc.aweme.views.WrapContentRemoteImageView */
public class WrapContentRemoteImageView extends RemoteImageView {

    /* renamed from: a */
    private final AbstractC24203d f181989a;

    static {
        Covode.recordClassIndex(94791);
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView
    /* renamed from: a */
    public final void mo61253a() {
        super.mo61253a();
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() {
                /* class com.p2082ss.android.ugc.aweme.views.WrapContentRemoteImageView.C814262 */

                static {
                    Covode.recordClassIndex(94793);
                }

                public final void getOutline(View view, Outline outline) {
                    float aspectRatio = WrapContentRemoteImageView.this.getAspectRatio();
                    float height = (float) WrapContentRemoteImageView.this.getHeight();
                    float width = (float) WrapContentRemoteImageView.this.getWidth();
                    if (height != 0.0f) {
                        float f = height * aspectRatio;
                        float f2 = (width - f) / 2.0f;
                        outline.setRoundRect((int) f2, 0, (int) (f2 + f), WrapContentRemoteImageView.this.getBottom(), C13628n.m24520b(WrapContentRemoteImageView.this.getContext(), 4.3f));
                    }
                }
            });
            setClipToOutline(true);
        }
    }

    /* renamed from: a */
    public final void mo125077a(AbstractC24457f fVar) {
        if (Build.VERSION.SDK_INT < 21) {
            getLayoutParams().width = (getLayoutParams().height * fVar.getWidth()) / fVar.getHeight();
            requestLayout();
        } else if (fVar != null) {
            setAspectRatio(((float) fVar.getWidth()) / ((float) fVar.getHeight()));
            if (Build.VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
        }
    }

    public WrapContentRemoteImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.facebook.drawee.view.SimpleDraweeView
    public void setImageURI(Uri uri, Object obj) {
        C24185e eVar = (C24185e) getControllerBuilder();
        eVar.f57303g = this.f181989a;
        eVar.f57298b = obj;
        C24185e a = eVar.mo39799b(uri);
        a.f57309m = getController();
        setController(a.mo39827e());
    }

    /* renamed from: a */
    public final void mo125078a(String str, AbstractC24203d<AbstractC24457f> dVar) {
        Uri uri;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        C24185e eVar = (C24185e) getControllerBuilder();
        eVar.f57303g = dVar;
        eVar.f57298b = null;
        C24185e a = eVar.mo39799b(uri);
        a.f57309m = getController();
        setController(a.mo39827e());
    }

    private WrapContentRemoteImageView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.f181989a = new C24202c<AbstractC24457f>() {
            /* class com.p2082ss.android.ugc.aweme.views.WrapContentRemoteImageView.C814251 */

            static {
                Covode.recordClassIndex(94792);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
                WrapContentRemoteImageView.this.mo125077a(fVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                WrapContentRemoteImageView.this.mo125077a(fVar);
            }
        };
    }
}
