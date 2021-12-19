package com.bytedance.android.livesdk.chatroom.p491f;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p499ui.C7759an;
import com.bytedance.android.livesdk.i18n.C8983b;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.model.message.p579c.C9699c;
import com.bytedance.android.livesdk.model.message.p579c.C9700d;
import com.bytedance.android.livesdk.model.message.p579c.C9701e;
import com.bytedance.android.livesdk.model.message.p579c.C9703g;
import com.bytedance.android.livesdk.model.message.p579c.C9706h;
import com.bytedance.android.livesdk.model.message.p579c.C9707i;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.widget.C11424f;
import com.bytedance.android.livesdkapi.host.AbstractC11803e;
import com.bytedance.android.livesdkapi.p692h.EnumC11780d;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.c */
public final class C7557c {

    /* renamed from: a */
    public static final Spannable f18769a = new SpannableString("");

    static {
        Covode.recordClassIndex(8330);
    }

    /* renamed from: a */
    private static int m15537a(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return C3966y.m9663b((int) R.color.a1w);
        }
    }

    /* renamed from: a */
    private static boolean m15544a(C9703g gVar) {
        if (gVar == null || gVar.f23670a == null || TextUtils.isEmpty(((AbstractC11803e) C6193a.m13435a(AbstractC11803e.class)).mo18863a(gVar.f23670a))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Spannable m15538a(C9698b bVar, String str) {
        String str2;
        if (bVar != null) {
            if (bVar.f23645a == null || TextUtils.isEmpty(C8983b.m17319a().mo15219a(bVar.f23645a))) {
                str2 = bVar.f23646b;
            } else {
                str2 = C8983b.m17319a().mo15219a(bVar.f23645a);
            }
            Spannable a = m15540a(str2, bVar, null);
            Spannable spannable = f18769a;
            if (a != spannable) {
                return a;
            }
            if (TextUtils.isEmpty(str)) {
                return spannable;
            }
            return new SpannableString(str);
        } else if (TextUtils.isEmpty(str)) {
            return f18769a;
        } else {
            return new SpannableString(str);
        }
    }

    /* renamed from: a */
    public static Spannable m15540a(String str, C9698b bVar, AbstractC7556b bVar2) {
        if (TextUtils.isEmpty(str) || bVar == null) {
            return f18769a;
        }
        if (bVar.f23648d == null || bVar.f23648d.size() == 0) {
            SpannableString spannableString = new SpannableString(str);
            if (bVar2 != null) {
                spannableString.setSpan(new ForegroundColorSpan(bVar2.mo11706G()), 0, spannableString.length(), 18);
            } else if (bVar.f23647c != null) {
                C9699c cVar = bVar.f23647c;
                if (!TextUtils.isEmpty(cVar.f23649a)) {
                    spannableString.setSpan(new ForegroundColorSpan(m15537a(cVar.f23649a)), 0, spannableString.length(), 18);
                }
            }
            m15541a(spannableString, 0, spannableString.length(), bVar2, false, -1);
            return spannableString;
        }
        try {
            List<C9700d> list = bVar.f23648d;
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m15543a(str, list, arrayList, linkedHashMap);
            if (arrayList.size() <= 0 || arrayList.size() != linkedHashMap.size()) {
                return f18769a;
            }
            return m15539a(bVar, arrayList, linkedHashMap, bVar2);
        } catch (Exception e) {
            C3854a.m9455a(6, "ttlive_exception", e.getStackTrace());
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            HashMap hashMap = new HashMap();
            hashMap.put("stack_trace", stringWriter.toString());
            C3868c.m9491a(C6542d.m13985b("ttlive_parse_text_status"), 1, hashMap);
            return f18769a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x009f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0227  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.Spannable m15539a(com.bytedance.android.livesdk.model.message.p579c.C9698b r18, java.util.List<java.lang.String> r19, java.util.Map<java.lang.Integer, com.bytedance.android.livesdk.model.message.p579c.C9700d> r20, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b r21) {
        /*
        // Method dump skipped, instructions count: 879
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p491f.C7557c.m15539a(com.bytedance.android.livesdk.model.message.c.b, java.util.List, java.util.Map, com.bytedance.android.livesdk.chatroom.f.b):android.text.Spannable");
    }

    /* renamed from: a */
    private static void m15543a(String str, List<C9700d> list, List<String> list2, Map<Integer, C9700d> map) {
        String str2;
        EnumC11780d dVar;
        if (str != null && list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(list2);
            arrayList.add(map);
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            while (i3 < str.length()) {
                char charAt = str.charAt(i3);
                if (charAt != ':') {
                    if (charAt != '{') {
                        if (charAt == '}') {
                            if (i5 != i2) {
                                str2 = str.subSequence(i5, i3).toString();
                            } else {
                                i7 = Integer.valueOf(str.subSequence(i6, i3).toString()).intValue();
                                str2 = "string";
                            }
                            if (i7 != i2) {
                                if (sb.length() > 0) {
                                    sb.delete(i, sb.length());
                                }
                                String str3 = null;
                                if (i7 >= 0 && i7 < list.size() && !TextUtils.isEmpty(str2) && list.size() != 0) {
                                    C9700d dVar2 = list.get(i7);
                                    int i8 = dVar2.f23657a;
                                    if (i8 == EnumC11780d.HEART.getPieceType()) {
                                        dVar = EnumC11780d.HEART;
                                    } else if (i8 == EnumC11780d.USER.getPieceType()) {
                                        dVar = EnumC11780d.USER;
                                    } else if (i8 == EnumC11780d.STRING.getPieceType()) {
                                        dVar = EnumC11780d.STRING;
                                    } else if (i8 == EnumC11780d.GIFT.getPieceType()) {
                                        dVar = EnumC11780d.GIFT;
                                    } else if (i8 == EnumC11780d.PATTERN_REF.getPieceType()) {
                                        dVar = EnumC11780d.PATTERN_REF;
                                    } else if (i8 == EnumC11780d.IMAGE.getPieceType()) {
                                        dVar = EnumC11780d.IMAGE;
                                    } else {
                                        dVar = EnumC11780d.UNKNOWN;
                                    }
                                    if (dVar.getTag().equals(str2)) {
                                        int i9 = dVar2.f23657a;
                                        String str4 = "";
                                        if (i9 == EnumC11780d.STRING.getPieceType()) {
                                            str3 = dVar2.f23659c;
                                        } else if (i9 == EnumC11780d.USER.getPieceType()) {
                                            C9707i iVar = dVar2.f23660d;
                                            if (!(iVar == null || iVar.f23677a == null)) {
                                                str3 = C6581g.m14075a(iVar.f23677a) + str4;
                                            }
                                        } else if (i9 == EnumC11780d.GIFT.getPieceType()) {
                                            C9701e eVar = dVar2.f23661e;
                                            if (eVar != null) {
                                                if (eVar.f23667c == 0) {
                                                    if (eVar.f23666b == null || eVar.f23666b.f23643a == null) {
                                                        str3 = C3966y.m9657a((int) R.string.gns) + " . ";
                                                    } else {
                                                        if (eVar.f23666b.f23643a != null) {
                                                            str4 = C8983b.m17319a().mo15219a(eVar.f23666b.f23643a);
                                                        }
                                                        if (TextUtils.isEmpty(str4)) {
                                                            str4 = eVar.f23666b.f23644b;
                                                        }
                                                        if (TextUtils.isEmpty(str4)) {
                                                            str4 = C3966y.m9657a((int) R.string.gns);
                                                        }
                                                        str3 = str4 + " . ";
                                                    }
                                                } else if (eVar.f23667c == 1 && eVar.f23668d != null) {
                                                    str3 = eVar.f23668d.f23996a;
                                                }
                                            }
                                        } else if (dVar2.f23657a == EnumC11780d.HEART.getPieceType()) {
                                            str3 = " ";
                                        } else {
                                            if (i9 == EnumC11780d.PATTERN_REF.getPieceType()) {
                                                C9706h hVar = dVar2.f23663g;
                                                if (hVar != null) {
                                                    if (!TextUtils.isEmpty(hVar.f23675a) && !TextUtils.isEmpty(C8983b.m17319a().mo15219a(hVar.f23675a))) {
                                                        str4 = C8983b.m17319a().mo15219a(hVar.f23675a);
                                                    } else if (!TextUtils.isEmpty(hVar.f23676b)) {
                                                        str4 = hVar.f23676b;
                                                    }
                                                }
                                            } else if (i9 == EnumC11780d.IMAGE.getPieceType()) {
                                                if (m15544a(dVar2.f23664h)) {
                                                    str3 = ".";
                                                }
                                            }
                                            str3 = str4;
                                        }
                                        list2.add(str3);
                                        map.put(Integer.valueOf(list2.size() - 1), dVar2);
                                        i4--;
                                        i5 = -1;
                                        i7 = -1;
                                    } else {
                                        C3854a.m9453a(6, "I18N_MESSAGE", "TextPieceHelper: tag is false");
                                    }
                                }
                                C3854a.m9453a(6, "I18N_MESSAGE", "piece result is null !!! \npattern:" + str + "... index:" + i7 + "...tag:" + str2);
                                i4--;
                                i5 = -1;
                                i7 = -1;
                            } else {
                                return;
                            }
                        } else if (charAt == '}') {
                        }
                        i3++;
                        i = 0;
                        i2 = -1;
                    } else {
                        i4++;
                        if (i4 == 1) {
                            i6 = i3 + 1;
                            if (sb.length() > 0 && sb.length() > 0) {
                                list2.add(sb.toString());
                                map.put(Integer.valueOf(list2.size() - 1), new C7555a());
                                sb.delete(0, sb.length());
                            }
                        } else {
                            return;
                        }
                    }
                } else if (i4 == 0) {
                    continue;
                    i3++;
                    i = 0;
                    i2 = -1;
                } else if (i4 == 1) {
                    i7 = Integer.valueOf(str.subSequence(i6, i3).toString()).intValue();
                    i5 = i3 + 1;
                    i6 = -1;
                } else {
                    return;
                }
                sb.append(charAt);
                i3++;
                i = 0;
                i2 = -1;
            }
            if (sb.length() > 0) {
                list2.add(sb.toString());
                map.put(Integer.valueOf(list2.size() - 1), new C7555a());
                sb.delete(0, sb.length());
            }
        }
    }

    /* renamed from: a */
    public static void m15542a(Spannable spannable, Bitmap bitmap, int i, int i2, AbstractC7556b bVar) {
        if (bitmap != null && !bitmap.isRecycled() && spannable != null && spannable.length() != 0 && i >= 0 && i <= spannable.length() && i <= i2) {
            Context e = C3966y.m9669e();
            int b = (int) C13628n.m24520b(C3966y.m9669e(), 16.0f);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(e.getResources(), bitmap);
            bitmapDrawable.setBounds(0, 0, b, b);
            spannable.setSpan(new C11424f(bitmapDrawable), i, i2, 33);
            m15541a(spannable, i, i2, bVar, false, -1);
        }
    }

    /* renamed from: a */
    private static void m15541a(Spannable spannable, int i, int i2, AbstractC7556b bVar, boolean z, int i3) {
        C7759an anVar;
        if (bVar != null && bVar.mo10375b() != null) {
            if (z) {
                anVar = new C7759an(bVar.mo10375b(), i3);
            } else {
                anVar = new C7759an(bVar.mo10375b());
            }
            spannable.setSpan(anVar, i, i2, 17);
        }
    }
}
