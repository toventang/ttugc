package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.d */
public final class C8175d extends AbstractC8170a {

    /* renamed from: p */
    public TextView f20297p;

    static {
        Covode.recordClassIndex(8998);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a
    /* renamed from: d */
    public final void mo14400d() {
        TextView textView = this.f20297p;
        if (textView != null && textView.getVisibility() == 0) {
            this.f20297p.performClick();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a
    /* renamed from: e */
    public final void mo14401e() {
        super.mo14401e();
        TextView textView = this.f20297p;
        if (textView != null) {
            textView.setText(this.f20280n);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a
    /* renamed from: c */
    public final View mo14399c() {
        return C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b55, this, false);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a
    public final void setText(String str) {
        super.setText(str);
        TextView textView = this.f20297p;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a
    /* renamed from: b */
    public final void mo14398b(final View view) {
        final ImageView imageView = (ImageView) findViewById(R.id.f205094dmt);
        this.f20297p = (TextView) findViewById(R.id.dmu);
        if (this.f20273g != null && this.f20273g.f23159a != null && this.f20273g.f23159a.getUrls() != null && this.f20273g.f23159a.getUrls().size() != 0) {
            String str = null;
            Iterator<String> it = this.f20273g.f23159a.getUrls().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (!TextUtils.isEmpty(next)) {
                    str = next;
                    break;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                view.setOnClickListener(View$OnClickListenerC8177e.f20302a);
                C3951p.m9627a(imageView, this.f20273g.f23159a, 0, new C3951p.AbstractC3953a() {
                    /* class com.bytedance.android.livesdk.chatroom.widget.C8175d.C81761 */

                    /* renamed from: d */
                    private boolean f20301d;

                    static {
                        Covode.recordClassIndex(8999);
                    }

                    @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                    /* renamed from: a */
                    public final void mo9301a(ImageModel imageModel) {
                    }

                    @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                    /* renamed from: a */
                    public final void mo9303a(ImageModel imageModel, Exception exc) {
                    }

                    @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                    /* renamed from: a */
                    public final void mo9302a(ImageModel imageModel, int i, int i2) {
                        int i3;
                        int i4;
                        String str;
                        float f;
                        if (!this.f20301d) {
                            this.f20301d = true;
                            int i5 = i / 2;
                            int i6 = i2 / 2;
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            layoutParams.width = i;
                            layoutParams.height = i2;
                            view.setLayoutParams(layoutParams);
                            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                            layoutParams2.width = -1;
                            layoutParams2.height = -1;
                            imageView.setLayoutParams(layoutParams2);
                            if (C8175d.this.f20273g.f23167i == -1 && C8175d.this.f20273g.f23168j == -1) {
                                i3 = ((C8175d.this.f20277k[2] + C8175d.this.f20277k[3]) / 2) - i5;
                                i4 = (C8175d.this.getResources().getDimensionPixelSize(R.dimen.ye) + C8175d.this.f20277k[1]) / 2;
                            } else {
                                float f2 = 1.0f;
                                if (C8175d.this.f20273g.f23169k > 0) {
                                    f = ((float) C8175d.this.f20278l) / ((float) C8175d.this.f20273g.f23169k);
                                } else {
                                    f = 1.0f;
                                }
                                if (C8175d.this.f20273g.f23170l > 0) {
                                    f2 = ((float) C8175d.this.f20279m) / ((float) C8175d.this.f20273g.f23170l);
                                }
                                i3 = ((int) (((float) C8175d.this.f20273g.f23167i) * f)) - i5;
                                i4 = (int) (((float) C8175d.this.f20273g.f23168j) * f2);
                            }
                            int i7 = i4 - i6;
                            if (i3 < C8175d.this.f20277k[2]) {
                                i3 = C8175d.this.f20277k[2];
                            } else if (layoutParams.width + i3 > C8175d.this.f20277k[3]) {
                                i3 = C8175d.this.f20277k[3] - layoutParams.width;
                            }
                            if (i7 < C8175d.this.f20277k[0]) {
                                i7 = C8175d.this.f20277k[0];
                            } else if (layoutParams.height + i7 > C8175d.this.f20277k[1]) {
                                i7 = C8175d.this.f20277k[1] - layoutParams.height;
                            }
                            view.setX((float) i3);
                            view.setY((float) i7);
                            C8175d.this.f20273g.f23167i = i3 + i5;
                            C8175d.this.f20273g.f23168j = i7 + i6;
                            if (C8175d.this.f20274h && C8175d.this.f20275i != null) {
                                C8175d.this.f20275i.mo14280d();
                            }
                            if (1 == C8175d.this.f20273g.f23165g) {
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) C8175d.this.f20297p.getLayoutParams();
                                if (C8175d.this.f20273g.f23164f != null && C8175d.this.f20273g.f23164f.length == 4) {
                                    layoutParams3.leftMargin = (int) C13628n.m24520b(C8175d.this.getContext(), ((float) C8175d.this.f20273g.f23164f[0]) / 2.0f);
                                    layoutParams3.topMargin = (int) C13628n.m24520b(C8175d.this.getContext(), ((float) C8175d.this.f20273g.f23164f[1]) / 2.0f);
                                    layoutParams3.width = (int) C13628n.m24520b(C8175d.this.getContext(), ((float) C8175d.this.f20273g.f23164f[2]) / 2.0f);
                                    layoutParams3.height = (int) C13628n.m24520b(C8175d.this.getContext(), ((float) C8175d.this.f20273g.f23164f[3]) / 2.0f);
                                }
                                C8175d.this.f20297p.setLayoutParams(layoutParams3);
                                C8175d.this.f20297p.setTextSize(2, (float) (C8175d.this.f20273g.f23161c / 2));
                                C8175d.this.f20297p.setTextColor(Color.parseColor(C8175d.this.f20273g.f23160b));
                                if (!TextUtils.isEmpty(C8175d.this.f20280n)) {
                                    str = C8175d.this.f20280n;
                                } else if (!TextUtils.isEmpty(C8175d.this.f20273g.f23162d)) {
                                    str = C8175d.this.f20273g.f23162d;
                                } else {
                                    str = "";
                                }
                                C8175d.this.f20297p.setText(str);
                                C8175d.this.f20297p.setVisibility(0);
                            } else {
                                C8175d.this.f20297p.setVisibility(8);
                            }
                            C8175d.this.setVisibility(0);
                        }
                    }
                });
            }
        }
    }

    public C8175d(Context context, C9537au auVar, boolean z, int[] iArr, AbstractC8170a.AbstractC8172a aVar, boolean z2) {
        super(context, auVar, z, iArr, aVar, z2);
    }
}
