package com.bytedance.ies.bullet.p1184ui.common;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;

/* renamed from: com.bytedance.ies.bullet.ui.common.k */
public interface AbstractC17051k {

    /* renamed from: com.bytedance.ies.bullet.ui.common.k$a */
    public interface AbstractC17052a {
        static {
            Covode.recordClassIndex(19501);
        }

        ImageView getBackView();

        ImageView getCloseAllView();

        ImageView getMoreButtonView();

        ImageView getReportView();

        ImageView getShareView();

        View getTitleBarRoot();

        TextView getTitleView();

        void setDefaultTitle(CharSequence charSequence);

        void setTitleBarBackgroundColor(int i);
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.k$b */
    public interface AbstractC17053b {
        static {
            Covode.recordClassIndex(19502);
        }

        /* renamed from: a */
        View mo26927a(Context context, Uri uri, C16721b bVar);

        /* renamed from: a */
        void mo26928a(View.OnClickListener onClickListener);

        /* renamed from: a */
        void mo26929a(CharSequence charSequence);

        /* renamed from: b */
        void mo26930b(View.OnClickListener onClickListener);
    }

    static {
        Covode.recordClassIndex(19500);
    }
}
