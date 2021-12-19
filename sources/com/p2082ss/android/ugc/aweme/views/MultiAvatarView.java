package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.views.MultiAvatarView */
public final class MultiAvatarView extends FrameLayout {

    /* renamed from: a */
    public boolean f181895a;

    /* renamed from: b */
    private int f181896b;

    /* renamed from: c */
    private int f181897c;

    /* renamed from: d */
    private int f181898d;

    /* renamed from: e */
    private int f181899e;

    static {
        Covode.recordClassIndex(94763);
    }

    public MultiAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setDigitLimit(int i) {
        this.f181899e = i;
    }

    public final void setMaxAvatarNumber(int i) {
        this.f181898d = i;
    }

    /* renamed from: a */
    private static String m141120a(long j) {
        return "+" + C53437b.m98615a(j);
    }

    /* renamed from: a */
    public final void mo125016a(int i, int i2) {
        if (!(i == this.f181897c && i2 == this.f181896b) && getChildCount() > 0) {
            removeAllViews();
        }
        this.f181897c = i;
        this.f181896b = i2;
    }

    /* renamed from: a */
    private final View m141118a(int i, String str) {
        MethodCollector.m26663i(13010);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.agb, (ViewGroup) null);
        C89219l.m154716b(inflate, "");
        inflate.setMinimumWidth(this.f181897c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, this.f181897c);
        if (C80471gb.m139483a(inflate.getContext())) {
            layoutParams.setMargins(0, 0, this.f181896b * i, 0);
        } else {
            layoutParams.setMargins(this.f181896b * i, 0, 0, 0);
        }
        inflate.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.f0f);
        C89219l.m154716b(textView, "");
        textView.setText(str);
        MethodCollector.m26664o(13010);
        return inflate;
    }

    /* renamed from: a */
    private final View m141119a(User user, int i) {
        MethodCollector.m26663i(12927);
        UrlModel urlModel = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aiq, (ViewGroup) null);
        int i2 = this.f181897c;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        if (C80471gb.m139483a(inflate.getContext())) {
            layoutParams.setMargins(0, 0, this.f181896b * i, 0);
        } else {
            layoutParams.setMargins(this.f181896b * i, 0, 0, 0);
        }
        inflate.setLayoutParams(layoutParams);
        RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.nz);
        if (user != null) {
            urlModel = user.getAvatarThumb();
        }
        C34577e.m70592a(remoteImageView, urlModel);
        C89219l.m154716b(inflate, "");
        MethodCollector.m26664o(12927);
        return inflate;
    }

    /* renamed from: a */
    public final void mo125017a(List<? extends User> list, long j) {
        Number valueOf;
        int i = 0;
        if (!(list == null || list.isEmpty())) {
            setVisibility(0);
            removeAllViews();
            if (!this.f181895a) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    addView(m141119a((User) list.get(size), size));
                }
            } else {
                for (T t : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (i < this.f181898d) {
                        addView(m141119a((User) t2, i));
                    }
                    i = i2;
                }
            }
            int size2 = list.size();
            int i3 = this.f181898d;
            if (size2 > i3 || j > ((long) i3)) {
                if (j <= ((long) i3)) {
                    valueOf = Integer.valueOf(size2);
                } else {
                    valueOf = Long.valueOf(j);
                }
                long longValue = valueOf.longValue();
                int i4 = this.f181898d;
                addView(m141118a(i4, m141120a(longValue - ((long) i4))));
            }
        }
    }

    private /* synthetic */ MultiAvatarView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MultiAvatarView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(13012);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f181896b = C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        this.f181897c = C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics()));
        this.f181898d = 3;
        this.f181895a = true;
        this.f181899e = 99;
        MethodCollector.m26664o(13012);
    }
}
