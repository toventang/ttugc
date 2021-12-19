package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89214g;

public final class GameTag {
    public static final C9511a Companion = new C9511a((byte) 0);
    @AbstractC27891c(mo46611a = "full_name")
    public String fullName;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public Long f23082id;
    private boolean selected;
    @AbstractC27891c(mo46611a = "short_name")
    public String shortName;
    @AbstractC27891c(mo46611a = "show_name")
    public String showName;

    static {
        Covode.recordClassIndex(11035);
    }

    public GameTag() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: com.bytedance.android.livesdk.model.GameTag$a */
    public static final class C9511a {
        static {
            Covode.recordClassIndex(11036);
        }

        private C9511a() {
        }

        public /* synthetic */ C9511a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Map<String, String> m17803a(GameTag gameTag) {
            if (gameTag == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("key_id", String.valueOf(gameTag.f23082id));
            String str = gameTag.showName;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            linkedHashMap.put("key_show_name", str);
            String str3 = gameTag.shortName;
            if (str3 == null) {
                str3 = str2;
            }
            linkedHashMap.put("key_short_name", str3);
            String str4 = gameTag.fullName;
            if (str4 != null) {
                str2 = str4;
            }
            linkedHashMap.put("key_full_name", str2);
            return linkedHashMap;
        }

        /* renamed from: a */
        public static GameTag m17802a(Map<String, String> map) {
            long j;
            if (map == null || map.isEmpty()) {
                return null;
            }
            GameTag gameTag = new GameTag(null, null, null, null, 15, null);
            String str = map.get("key_id");
            if (str != null) {
                j = Long.parseLong(str);
            } else {
                j = 0;
            }
            gameTag.f23082id = Long.valueOf(j);
            String str2 = map.get("key_show_name");
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            gameTag.showName = str2;
            String str4 = map.get("key_short_name");
            if (str4 == null) {
                str4 = str3;
            }
            gameTag.shortName = str4;
            String str5 = map.get("key_full_name");
            if (str5 != null) {
                str3 = str5;
            }
            gameTag.fullName = str3;
            return gameTag;
        }
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean isNonGameItem() {
        Long l = this.f23082id;
        if (l != null && l.longValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isOtherGameItem() {
        Long l = this.f23082id;
        if (l != null && l.longValue() == -1) {
            return true;
        }
        return false;
    }

    public final boolean isNonGameOrOtherGameItem() {
        Long l = this.f23082id;
        if (l != null && l.longValue() == -1) {
            return true;
        }
        Long l2 = this.f23082id;
        if (l2 != null && l2.longValue() == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "GameTag(id=" + this.f23082id + ", showName=" + this.showName + ", shortName=" + this.shortName + ", fullName=" + this.fullName + ", selected=" + this.selected + ')';
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public GameTag(Long l, String str, String str2, String str3) {
        this.f23082id = l;
        this.showName = str;
        this.shortName = str2;
        this.fullName = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GameTag(Long l, String str, String str2, String str3, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
