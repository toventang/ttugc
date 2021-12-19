package com.bytedance.router;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class SmartIntent extends Intent {
    static {
        Covode.recordClassIndex(25834);
    }

    /* renamed from: com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m41553x6032dbe8(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m41554x6032dbe8(String str, String str2, Throwable th) {
        return 0;
    }

    public Uri getData() {
        return super.getData();
    }

    public Bundle getExtras() {
        return m41552x66104edc(this);
    }

    private SmartIntent(Intent intent) {
        super(intent);
    }

    /* renamed from: com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m41552x66104edc(Intent intent) {
        try {
            return super.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isSmartIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent instanceof SmartIntent;
    }

    public static Intent smartIntent(Intent intent) {
        if (intent != null && !(intent instanceof SmartIntent)) {
            return new SmartIntent(intent);
        }
        return intent;
    }

    /* renamed from: com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get */
    public static Object m41551xdea0eb19(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public boolean getBooleanExtra(String str, boolean z) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m41552x66104edc(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m41551xdea0eb19(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return z;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Boolean.parseBoolean((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Boolean", Boolean.valueOf(z), e);
                return z;
            }
        } else {
            try {
                return ((Boolean) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).booleanValue();
            } catch (ClassCastException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Boolean", Boolean.valueOf(z), e2);
                return z;
            }
        }
    }

    public byte getByteExtra(String str, byte b) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m41552x66104edc(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m41551xdea0eb19(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return b;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Byte.parseByte((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Byte", Byte.valueOf(b), e);
                return b;
            }
        } else {
            try {
                return ((Byte) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).byteValue();
            } catch (ClassCastException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Byte", Byte.valueOf(b), e2);
                return b;
            }
        }
    }

    public double getDoubleExtra(String str, double d) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m41552x66104edc(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m41551xdea0eb19(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return d;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Double.parseDouble((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Double", Double.valueOf(d), e);
                return d;
            }
        } else {
            try {
                return ((Double) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).doubleValue();
            } catch (ClassCastException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Double", Double.valueOf(d), e2);
                return d;
            }
        }
    }

    public float getFloatExtra(String str, float f) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m41552x66104edc(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m41551xdea0eb19(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return f;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Float.parseFloat((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Float", Float.valueOf(f), e);
                return f;
            }
        } else {
            try {
                return ((Float) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).floatValue();
            } catch (ClassCastException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Float", Float.valueOf(f), e2);
                return f;
            }
        }
    }

    public int getIntExtra(String str, int i) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m41552x66104edc(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m41551xdea0eb19(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return i;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Integer.parseInt((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Integer", Integer.valueOf(i), e);
                return i;
            }
        } else {
            try {
                return ((Integer) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).intValue();
            } catch (ClassCastException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Integer", Integer.valueOf(i), e2);
                return i;
            }
        }
    }

    public long getLongExtra(String str, long j) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m41552x66104edc(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m41551xdea0eb19(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return j;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Long.parseLong((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (NumberFormatException e) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Long", Long.valueOf(j), e);
                return j;
            }
        } else {
            try {
                return ((Long) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).longValue();
            } catch (ClassCastException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Long", Long.valueOf(j), e2);
                return j;
            }
        }
    }

    public char getCharExtra(String str, char c) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m41552x66104edc(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m41551xdea0eb19(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return c;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            String str2 = (String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
            if (str2.length() == 1) {
                return str2.charAt(0);
            }
            typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Char", Character.valueOf(c), null);
            return c;
        }
        try {
            return ((Character) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).charValue();
        } catch (ClassCastException e) {
            typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Char", Character.valueOf(c), e);
            return c;
        }
    }

    public short getShortExtra(String str, short s) {
        Object com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m41552x66104edc(this);
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m41551xdea0eb19(com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, str)) == null) {
            return s;
        }
        if (com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                return Short.valueOf(Short.parseShort((String) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get)).shortValue();
            } catch (NumberFormatException e) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Short", Short.valueOf(s), e);
                return s;
            }
        } else {
            try {
                return ((Short) com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get).shortValue();
            } catch (ClassCastException e2) {
                typeWarning(str, com_bytedance_router_SmartIntent_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "Short", Short.valueOf(s), e2);
                return s;
            }
        }
    }

    private void typeWarning(String str, Object obj, String str2, Object obj2, RuntimeException runtimeException) {
        m41553x6032dbe8("SmartIntent", "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        if (runtimeException != null) {
            m41554x6032dbe8("SmartIntent", "Attempt to cast generated internal exception:", runtimeException);
        }
    }
}
