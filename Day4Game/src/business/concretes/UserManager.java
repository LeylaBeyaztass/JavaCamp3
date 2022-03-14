package business.concretes;

import business.abstracts.UserService;
import entities.concretes.User;

public class UserManager implements UserService {

    @Override
    public void register(User user) {
        System.out.println(user.getFirstName() + " kaydınız başarılı bir şekilde oluşturuldu");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() + " kaydınız başarılı bir şekilde güncellendi");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() + " kaydınız başarılı bir şekilde silindi");
    }
}
