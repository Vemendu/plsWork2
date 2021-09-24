import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

import javax.security.auth.login.LoginException;
import java.util.EventListener;

public class Main {
    public static void main(String[] args) throws LoginException, InterruptedException {
        JDA jda = JDABuilder.createDefault("ODc3ODk1OTE1ODg3Nzg4MDMy.YR5SSA.epo91eWj4Vco-90_lhUWC9w3IKg")
                .addEventListeners(new Ping())
                .build();
    }
}
