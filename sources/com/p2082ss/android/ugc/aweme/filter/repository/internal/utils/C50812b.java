package com.p2082ss.android.ugc.aweme.filter.repository.internal.utils;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.effectplatform.C46402a;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50721d;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50696d;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.EnumC50699g;
import com.p2082ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.utils.b */
public final class C50812b {

    /* renamed from: a */
    public static final C50721d f117260a = new C50721d("", "");

    static {
        Covode.recordClassIndex(59983);
    }

    /* renamed from: a */
    public static final C50696d m95163a(int i) {
        return new C50696d(i, EnumC50699g.FILTER_STATE_UNKNOWN, "", "");
    }

    /* renamed from: b */
    private static int m95168b(Effect effect) {
        C89219l.m154721d(effect, "");
        try {
            return Integer.parseInt(effect.getEffectId());
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static final C50698f m95169b(FilterBean filterBean) {
        C89219l.m154721d(filterBean, "");
        return m95165a(filterBean);
    }

    /* renamed from: a */
    public static final C50698f m95165a(FilterBean filterBean) {
        C89219l.m154721d(filterBean, "");
        int id = filterBean.getId();
        String resId = filterBean.getResId();
        C89219l.m154716b(resId, "");
        String extra = filterBean.getExtra();
        String name = filterBean.getName();
        C89219l.m154716b(name, "");
        String enName = filterBean.getEnName();
        ToolsUrlModel resource = filterBean.getResource();
        List<String> tags = filterBean.getTags();
        C89219l.m154716b(tags, "");
        return new C50698f(id, resId, name, enName, resource, tags, filterBean.getTagUpdateAt(), filterBean.getThumbnailFileUri(), extra);
    }

    /* renamed from: a */
    public static final C50698f m95166a(Effect effect) {
        String str;
        Object obj;
        String str2;
        C89219l.m154721d(effect, "");
        int b = m95168b(effect);
        String resourceId = effect.getResourceId();
        String extra = effect.getExtra();
        String name = effect.getName();
        C89219l.m154721d(effect, "");
        List<String> tags = effect.getTags();
        Uri uri = null;
        if (tags != null && !tags.isEmpty()) {
            Iterator<String> it = tags.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (C89361p.m154874b(next, "pinyin:", false)) {
                    Objects.requireNonNull(next, "null cannot be cast to non-null type java.lang.String");
                    str = next.substring(7);
                    C89219l.m154716b(str, "");
                    break;
                }
            }
        }
        str = null;
        UrlModel a = C46402a.m89551a(effect.getFileUrl());
        ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
        toolsUrlModel.f174537a = a.getUri();
        toolsUrlModel.f174538b = a.getUrlList();
        List<String> tags2 = effect.getTags();
        if (tags2 == null) {
            tags2 = new ArrayList<>();
        }
        String tagsUpdatedAt = effect.getTagsUpdatedAt();
        try {
            List<String> urlList = effect.getIconUrl().getUrlList();
            if (urlList != null) {
                str2 = urlList.get(0);
            } else {
                str2 = null;
            }
            obj = C89379q.m157068constructorimpl(Uri.parse(str2));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (!C89379q.m157073isFailureimpl(obj)) {
            uri = obj;
        }
        return new C50698f(b, resourceId, name, str, toolsUrlModel, tags2, tagsUpdatedAt, uri, extra);
    }

    /* renamed from: a */
    public static final C50696d m95164a(FilterBean filterBean, EnumC50699g gVar) {
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(gVar, "");
        int id = filterBean.getId();
        String filterFilePath = filterBean.getFilterFilePath();
        C89219l.m154716b(filterFilePath, "");
        String filterFolder = filterBean.getFilterFolder();
        C89219l.m154716b(filterFolder, "");
        return new C50696d(id, gVar, filterFilePath, filterFolder);
    }

    /* renamed from: a */
    public static final void m95167a(C50696d dVar, FilterBean filterBean) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(filterBean, "");
        filterBean.setFilterFilePath(dVar.f117043c);
        filterBean.setFilterFolder(dVar.f117044d);
    }
}
