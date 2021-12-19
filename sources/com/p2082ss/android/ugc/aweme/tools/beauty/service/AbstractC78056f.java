package com.p2082ss.android.ugc.aweme.tools.beauty.service;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.f */
public interface AbstractC78056f {

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.f$a */
    public interface AbstractC78057a {
        static {
            Covode.recordClassIndex(91148);
        }

        /* renamed from: a */
        void mo22723a();

        /* renamed from: a */
        void mo121548a(String str, String str2, float f);

        /* renamed from: a */
        void mo121549a(List<BeautyComposerInfo> list, int i);

        /* renamed from: a */
        void mo121550a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2, int i);

        /* renamed from: a */
        void mo121551a(boolean z);

        /* renamed from: a */
        int[] mo121552a(String str, String str2);

        /* renamed from: b */
        void mo22724b();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.f$b */
    public interface AbstractC78058b {
        static {
            Covode.recordClassIndex(91149);
        }

        /* renamed from: a */
        void mo22665a(ComposerBeauty composerBeauty);

        /* renamed from: a */
        void mo22666a(ComposerBeauty composerBeauty, int i, List<String> list);

        /* renamed from: a */
        void mo22667a(ComposerBeauty composerBeauty, List<String> list);

        /* renamed from: a */
        void mo22668a(BeautyCategory beautyCategory);

        /* renamed from: b */
        void mo22669b(ComposerBeauty composerBeauty);

        /* renamed from: b */
        void mo22670b(ComposerBeauty composerBeauty, List<String> list);
    }

    static {
        Covode.recordClassIndex(91147);
    }

    /* renamed from: b */
    void mo121670b();

    /* renamed from: c */
    void mo121671c();

    void setContainer(ViewGroup viewGroup);
}
