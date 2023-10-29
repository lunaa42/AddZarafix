
import com.google.firebase.auth
public class FirebaseServices {
    private static FirebaseServices instance;
    private FirebaseAuth auth;
    private FirebaseFirestore fire;
    private FirebaseStorage storage;

    public FirebaseServices(){
        auth = FirebaseAuth.getIntance();
        fire = FirebaseFirestore.getIntance();
        storage = FirebaseStorage.getIntance();
    }
}
