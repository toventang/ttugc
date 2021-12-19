package com.bytedance.tux.extension.player.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.extension.player.C23098e;
import com.bytedance.tux.extension.player.EnumC23097d;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

public final class TextureVideoView extends FrameLayout {

    /* renamed from: a */
    private Bitmap f54695a;

    /* renamed from: b */
    private HashMap f54696b;

    static {
        Covode.recordClassIndex(27037);
    }

    /* renamed from: a */
    private View m43565a(int i) {
        if (this.f54696b == null) {
            this.f54696b = new HashMap();
        }
        View view = (View) this.f54696b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f54696b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Bitmap getVideoFrame() {
        if (C23098e.f54671a == EnumC23097d.PLAYER_IDLE) {
            return this.f54695a;
        }
        TextureView textureView = (TextureView) m43565a(R.id.fdp);
        C89219l.m154709a((Object) textureView, "");
        return textureView.getBitmap();
    }

    public final void setCoverImage(Bitmap bitmap) {
        this.f54695a = bitmap;
        if (bitmap != null) {
            ((ImageView) m43565a(R.id.afn)).setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextureVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154719c(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TextureVideoView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(8746);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bi7, this, true);
        MethodCollector.m26664o(8746);
    }
}
