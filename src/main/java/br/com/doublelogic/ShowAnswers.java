package br.com.doublelogic;

import br.com.doublelogic.parser.GooglonParser;

import java.text.ParseException;

/**
 * Created by diegoalvessaidsimao on 20/09/15.
 */
public class ShowAnswers {

    private final static String INPUT = "rlcqtzg xzsnfsgh fhqqbd cnk wwc wxmstt trc wrx tdpcrzs gpqhzzbk vqc vwgvxm mgvtx nnwxz \n" +
            "\n" +
            "kvrfgwv fxqvdzkn tswqv rmvkhhsg bqwrpd wrhgm bdnwmcrh vcxlktq brbnwd pjb xcp \n" +
            "\n" +
            "ptqwfmgx rqhdp rbpvfqv wdhv jzxscwj frdtt czh tkt zdtj gcgvbkv knswpsxz jwms tvbxwtsj \n" +
            "\n" +
            "lwxqsdrz pnvt jlmn gfth fpp qkts kthjfr mfrw rwrbw rmqhjhwf vlkhr glpzg nnvxzgc kfbgdcwr vql \n" +
            "\n" +
            "tltdjdt vhmgjmj ngqbqsfx wxqr qbptc ltjsxd fxc jqfgcfw bwssvqr dpcmmbh sbgjzpvx blwrqs \n" +
            "\n" +
            "gvfw lmrhmw pqx htpqhq clprvqm xmhvmrvg mnlz qzwhxrc cbt xkpgn jslwrg thbhlm kjj \n" +
            "\n" +
            "sgdjkcfk gwsftsv lkkksrh jpp mlgrl mhg zgpgxgjk tltdkrwq qwtt zzttw gcvqfz mcc qfds dcvxjg \n" +
            "\n" +
            "gbjhvqz hmh sjtvcr svjpdpbc hwxpvf qbd mllhkf qqgcv dxz cltjjgnz sczff qvvjg wxjflspz hdlk \n" +
            "\n" +
            "htpr rbrljzn ttnxj qsbktqw mqlwm kgnlgjg gpqvvz knrt pngvjd wqd nsw shlltdx drzlt vmcbmff \n" +
            "\n" +
            "kspmmmsc xddxpsgp mrztvxz qzhkgdk hdjn zgnjlk nxv tfj cbvr pbchggld xnkhmqq vtk gchz \n" +
            "\n" +
            "dqjzzzg jzfwsg qftjwd mdzhgzj tjmhxbwf hjcrdlrj xkcv qfkppqhp dwpjvs gdmn jwq mqflkdlb pblf \n" +
            "\n" +
            "qhtxh vpf wdgknnl bfgsqhv mxrfsc fswgdkl xhrcx cfnz zjmsgrqb wcft hsxm sfmzb nvdbwfts \n" +
            "\n" +
            "lqmm xrzxsrj lphc zqhhjf twr xszrmd nfqmj clmtfd rfxdtw ldd xzpclbz zvjnnjjr ggqc kqw hsvtdl \n" +
            "\n" +
            "kvlqt rhdwpm ctwtdm ntbw bqlf rjsrjcbm rqtdl tvh sgdxskdk kbzjqbnm jbvvqmvp rvxcgt mnzg \n" +
            "\n" +
            "grfkn pzjv xzwszlqk qswjsj fhwk wpltw dcbmwxb fwwxk mhxlv wtsjhzcw tvq sfk dkkwghg \n" +
            "\n" +
            "pmmm npppjg jqrfpt scrqtpz qpmdqpg nvbq zwt dxk wmcw wlznx gtdjw hqg ftpmt hpbgvkx \n" +
            "\n" +
            "crglkns xpvbfj vdg flvgswj pbpjgt krjkhnh nfggbkt bjbc trmzr zxblrc kjbflsct vjctt rwxlszx xkcm \n" +
            "\n" +
            "qpvzjxb hfw vrvrhb sfqgmv qzjqmxrn htvwqtft hrdz tdksfv schl grfk mmvgls jtfwffkn wfv \n" +
            "\n" +
            "dwlkbbqt sbfwh pqw gmhft lkzhs nmwkdt tfbdswl lgjnpxz cpxbdzbd mhc srslkqnt wlvd ksg \n" +
            "\n" +
            "bbpxdgxw lqmq htstpdg nxl vqjqwgv swph spzvhkx wmqfqpgs ffntvxt bhfcdx kzgxb dffz fhgp \n" +
            "\n" +
            "fvzg gdr lkt kwhwz hzmz cmcs zmf bnlphw kqmjdhd tpwtcqg rnmnsh vvjg jbl jqjqc cxnfcf \n" +
            "\n" +
            "ghsvrnmd tqlrk rksvtv dsdjfszd jcwjf rvnfwstk srrv dwvcr wlrk hvqw nplmkjm psksgj qtzhkl \n" +
            "\n" +
            "ntgbwx mhrxl nxfcnw pjdm ncjc kvdvvd hsqnp pdc jbr ltnr tckbs gjmqn zkzxhxt gshr zjqt kmzj \n" +
            "\n" +
            "ckt zjghrnpw srrnp rnd xwb xfhtnwpw bcwd pctb qtbgffp vrhtv gvzk mwbpgtd zqvpz kvvtnh \n" +
            "\n" +
            "gtmhl jnn svgpmfqg zzkkckq fqswh hrbxmz xlrv xhvj kbjlsp rnqxzl wdkth tvwxh qwrvnb crhgptl \n" +
            "\n" +
            "csqmpw gkhztt txmg fbdw lnccxx dvqtzgb pkwfb nwktflk vdh fdprwwq gwqkzmrj gfnvtmn mks \n" +
            "\n" +
            "bwvwdfnw qfcgnvjg dgp fpmgt wccx kpv qrzgghp hlsndflr rvmpqv xktdpqcr ffgfhqfx txbpp \n" +
            "\n" +
            "xwlwzgxx bbw mpzdtf bsgdh skqtxqgr wqbf gwwdnhhk mdbl gxzvt ljlhvfhf pjlxph jcc mwhcp \n" +
            "\n" +
            "jjndnp hzb hnzkr psbvvtv wvvfvggf gdwgsvxt grhgtxjb rrqrt nfwzplcp zwffrs thxprn hpmqz \n" +
            "\n" +
            "kqwvhl pkc shdjt dfc hzmnkd mfhmqvg twd ngjfs fhhnmln gls dzjjcwx knstwtx jwltb lrxdzvh \n" +
            "\n" +
            "pblpx pcvmdcp bph ktbnp hgqdxt lhbpmb hcqq wpg zffdmqt jhrkvdlr jnjvpws sqnwc mqz \n" +
            "\n" +
            "xszrcn dhnspltd nrjfn fxxx wbhqxhn swt tqms lpgnkxgw hgnnxzm kjsmdv txlzvh fxb tdrb dpft \n" +
            "\n" +
            "lkmjdbms wkcwjdwf cws wfnhjdb hkcv qhwghntc fjfptrf tvlxdgsx xvgxfnz jlnf gqjwqhc fvmp \n" +
            "\n" +
            "pvdkpvnb nxzqkwcm gbbmjdl vcfmlcrq fnfpcpr phdx pdwhhv vbbtprbg tkgxrg xjl sfg dzr \n" +
            "\n" +
            "zsxrvvv kmnwsv prtvnmgt vxkr czdr dwqkhmb qjqfpn kwdz slmlxll gnchd bqljpf hvfjvvm flzsd \n" +
            "\n" +
            "fmbltm dsssfh scv tdglq rzlz cmsgb rclmbk xflqvcr tstz gdtrf gggwf gzgszcs lwnsbhgz \n" +
            "\n" +
            "wxwmwx xpcvp zxlgcmd kbctjvwp kmvpmgjn xmfxm cxd phn gszxm vvtmc rvlhs kzww \n" +
            "\n" +
            "rvbpnlcs hktfzd bmvpm ltc wjxdq xgdzdgn hgks pmgsc dvp bwdjrsb sxcwkhk wkq rbv qshr \n" +
            "\n" +
            "hgdjpbch pdr jqm gmmlrzpr cqswg kvkhdt vtk qzs ctl bqjgj jprhc jnmhzm ntnqqxgm hmklq \n" +
            "\n" +
            "clnfzptw jllgzk vlsp shfnhbgj jwll qpzkn gdwrqkd hrpc gxhdt shps jhlq hsxd llf kql klx vsl sjz \n" +
            "\n" +
            "kbcxw svsrtmm ldfnrx bhkrhnv fgt jrdx hjvnm crbjwbwh lgdw lpq mpddzcd mpfpc hvjf twhc \n" +
            "\n" +
            "wzlx jddrv bpkndk npkxpjsc hvjpjz hzvqctn gggb rmdlrtb pgttq dgmxzq jtvhxlfp xqncnj \n" +
            "\n" +
            "wnmfzcss xpp cqbvxprb rkktmnjn rrcbztns qtbjpg cwsqvbvz ppdp xdbrnxh jcrhqpq zlqmf \n" +
            "\n" +
            "wgnlphqr mzf ghgsv ljpzmcdr wht bmqltx jhj vtmdjw cvkpgrd mnjjtp bbf bvmjwrpq jjhzhfb \n" +
            "\n" +
            "xbjmdz dnk bqghggnx rhdkcw hqqml rvmghh lzsfdq lpxlfmbj kpjlj sxlb rgn hwnfwzdh dsxfk";

    public static void main(String[] args) {
        GooglonParser parser = new GooglonParser(INPUT);
        System.out.println(parser.countPrepositions());
        System.out.println(parser.countVerbs());
        System.out.println(parser.countFirstPersonVerbs());
        try {
            System.out.println(parser.getVocabulary());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parser.countPrettyNumbers());
    }
}
